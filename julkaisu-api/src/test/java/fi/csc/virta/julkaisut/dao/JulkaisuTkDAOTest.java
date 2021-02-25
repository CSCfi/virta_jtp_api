package fi.csc.virta.julkaisut.dao;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.querydsl.sql.H2Templates;
import fi.csc.virta.julkaisut.Util.ObjectResultSetConverter;
import fi.csc.virta.julkaisut.domain.JulkaisuTK;
import org.apache.commons.io.FileUtils;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Test class for {@link JulkaisuTkDAO} class.
 */
public class JulkaisuTkDAOTest extends AbstractDAOTest {

    private JulkaisuTkDAO julkaisuTkDAO;
    private ByteArrayOutputStream baos;
    private ObjectMapper mapper;
    private JsonGenerator jg;

    @Before
    public void setUp() throws Exception {
        baos = new ByteArrayOutputStream();
        mapper = new ObjectMapper();
        jg = mapper.getFactory().createGenerator(baos);
        julkaisuTkDAO = new JulkaisuTkDAO(H2Templates.builder().quote().build(), getConfig());
        insertData("/sql/julkaisut_tk_fixture.sql");
    }

    @After
    public void tearDown() throws Exception {
        clearData();
    }

    @Test
    public void testGetAll() throws Exception {
        jg.writeStartArray();
        julkaisuTkDAO.getAll(getJulkaisuTKConverter(), "*");
        jg.writeEndArray();
        jg.flush();
        assertThat(baos.size()).isGreaterThan(0);
        JSONAssert.assertEquals(readFromFile("/results/julkaisut_tk_all.json"), baos.toString(), true);
    }

    private String readFromFile(String resultFile) throws IOException {
        URL resource = getClass().getResource(resultFile);
        return FileUtils.readFileToString(new File(resource.getFile()));
    }

    private ObjectResultSetConverter<JulkaisuTK> getJulkaisuTKConverter() throws IOException {
        return new ObjectResultSetConverter<>(jg, mapper, JulkaisuTK.class);
    }
}