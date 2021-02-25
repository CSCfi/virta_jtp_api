package fi.csc.virta.julkaisut.dao;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.querydsl.sql.H2Templates;
import fi.csc.virta.julkaisut.Util.JsonRawConverter;
import fi.csc.virta.julkaisut.Util.ObjectConverter;
import fi.csc.virta.julkaisut.Util.RawConverter;
import fi.csc.virta.julkaisut.Util.TestFileUtil;
import fi.csc.virta.julkaisut.domain.Julkaisu;
import fi.csc.virta.julkaisut.domain.Juuli;
import fi.csc.virta.julkaisut.domain.SearchQuery;
import org.h2.util.JdbcUtils;
import org.junit.After;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import rx.exceptions.Exceptions;

import javax.ws.rs.NotFoundException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * Test class for {@link JulkaisuDAO} class.
 */
public class JulkaisuDAOTest extends AbstractDAOTest {

    private JulkaisuDAO julkaisuDAO;
    private ByteArrayOutputStream baos;
    private ObjectMapper mapper;
    private JsonGenerator jg;

    @Before
    public void setUp() throws Exception {
        baos = new ByteArrayOutputStream();
        mapper = new ObjectMapper();
        jg = mapper.getFactory().createGenerator(baos);
        julkaisuDAO = new JulkaisuDAO(H2Templates.builder().quote().build(), getConfig());
        insertData("/sql/julkaisut_fixture.sql");
    }

    @After
    public void tearDown() throws Exception {
        clearData();
    }

    @Test
    public void testGetAll() throws Exception {
        jg.writeStartArray();
        julkaisuDAO.getAll(getJulkaisuConverter(), "*");
        jg.writeEndArray();
        jg.flush();
        assertTrue("Result should not be empty!", baos.size() > 0);
        JSONAssert.assertEquals(TestFileUtil.readFromFile("/results/julkaisut_all.json"), baos.toString(), true);
    }

    @Test
    public void testGetByJulkaisunTunnus() throws Exception {
        final String tunnus = "31313:RE02:2014";
        julkaisuDAO.getByJulkaisunTunnus(getJsonRawConverter(), tunnus, "*");
        jg.flush();
        assertTrue("Result should not be empty!", baos.size() > 0);
        JSONAssert.assertEquals(TestFileUtil.readFromFile("/results/julkaisu_id2.json"), baos.toString(), true);
    }

    @Test
    public void testGetByJulkaisunTunnusNotFound() {
        try {
            julkaisuDAO.getByJulkaisunTunnus(getJsonRawConverter(), "notfound", "*");
        } catch (Throwable e) {
            Throwable finalCause = Exceptions.getFinalCause(e);
            assertTrue("NotFoundException should be thrown!", finalCause instanceof NotFoundException);
        }
    }

    @Test
    public void testSearchByIlmoitusVuosi() throws Exception {
        SearchQuery searchQuery = new SearchQuery();
        searchQuery.ilmoitusVuosi = 2014;
        jg.writeStartArray();
        final ObjectConverter<Julkaisu> converter = getJulkaisuConverter();
        julkaisuDAO.search(searchQuery, converter, "*");
        jg.writeEndArray();
        jg.flush();
        assertEquals("Result count should match!", 9, converter.getCount());
    }

    @Test
    public void testCreateJuuliUrl() throws Exception {
        final String id = "31313:RE02:2014";
        final String url = "http://test.url";
        Juuli juuli = new Juuli();
        juuli.setJulkaisunTunnus(id);
        juuli.setJuuliURL(url);
        julkaisuDAO.createJuuliUrl(juuli, "*");
        Statement statement = null;
        ResultSet resultSet = null;
        try (Connection connection = ds.getConnection()) {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from \"Juuli_temp\"");
            assertTrue(resultSet.first());
            assertEquals("JulkaisuTunnus should match!", resultSet.getString(2), juuli.getJulkaisunTunnus());
            assertEquals("Juuli-URL should match!", resultSet.getString(3), juuli.getJuuliURL());
            Instant instant = LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
            Date actual = Date.from(instant);
            assertEquals("Created date should match!", resultSet.getDate(5), actual);
        } finally {
            JdbcUtils.closeSilently(resultSet);
            JdbcUtils.closeSilently(statement);
        }
    }

    @Test(expected = NotFoundException.class)
    public void testCreateJuuliUrlNotFound() throws SQLException {
        Juuli juuli = new Juuli();
        juuli.setJulkaisunTunnus("not_found");
        juuli.setJuuliURL("http://test.url");
        julkaisuDAO.createJuuliUrl(juuli, "*");
    }

    private RawConverter getJsonRawConverter() throws IOException {
        return new JsonRawConverter(jg);
    }

    private ObjectConverter<Julkaisu> getJulkaisuConverter() throws IOException {
        return new ObjectConverter<>(jg, mapper, Julkaisu.class);
    }
}