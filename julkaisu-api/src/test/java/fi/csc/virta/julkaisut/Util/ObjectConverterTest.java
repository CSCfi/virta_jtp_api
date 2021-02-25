package fi.csc.virta.julkaisut.Util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import fi.csc.virta.julkaisut.domain.Julkaisu;
import fi.csc.virta.julkaisut.exception.DataAccessException;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.powermock.api.mockito.PowerMockito.doThrow;
import static org.powermock.api.mockito.PowerMockito.mock;
import static org.powermock.api.mockito.PowerMockito.spy;
import static org.powermock.api.mockito.PowerMockito.when;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 * Test class for {@link ObjectConverter}.
 */
public class ObjectConverterTest {

    private final String dummyJson = "{\"dummyId\":123,\"name\":\"Test\",\"number\":1234,\"muutospvm\":\"2015-01-15\",\"luontipvm\":\"2015-01-14\"}";
    private final String dummyXml = "<Dummy><Name>Test</Name><Number>1234</Number></Dummy>";
    private JsonGenerator jg;
    private ObjectMapper mapper;
    private OutputStream out;

    @Before
    public void setUp() throws Exception {
        out = new ByteArrayOutputStream();
        mapper = new ObjectMapper();
        jg = mapper.getFactory().createGenerator(out);
    }

    @After
    public void tearDown() throws Exception {
        out.flush();
        out.close();
    }

    @Test
    public void testToJson() throws Exception {
        ObjectConverter<Dummy> converter = new ObjectConverter<>(jg, mapper, Dummy.class);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        converter.toJson(new Dummy(123L, "Test", 1234L, new Date(sdf.parse("2015-01-15").getTime()),
                new Date(sdf.parse("2015-01-14").getTime())));
        assertEquals("Json should match!", dummyJson, out.toString());
    }

    @Test
    public void testToObject() throws Exception {
        Long dummyId = 123L;
        Date muutosPvm = new Date(System.currentTimeMillis());
        ResultSet resultSet = mockResultSet(dummyId, dummyXml, muutosPvm);

        ObjectConverter<Dummy> converter = new ObjectConverter<>(jg, mapper, Dummy.class);

        Dummy dummy = converter.toObject(resultSet);
        assertNotNull(dummy);
        assertEquals("Dummy id should match!", dummyId, dummy.getDummyId());
        assertEquals("Dummy name should match!", "Test", dummy.getName());
        assertEquals("Dummy number should match!", Long.valueOf(1234), dummy.getNumber());
        assertEquals("Dummy muutosPvm should match!", muutosPvm, dummy.getMuutospvm());
    }

    @Test
    public void testJulkaisuXmlToObject() throws Exception {
        final String xml = TestFileUtil.readFromFile("/fixtures/julkaisu.xml");
        final ObjectConverter<Julkaisu> converter = new ObjectConverter<>(jg, mapper, Julkaisu.class);
        final Date muutosPvm = new Date(System.currentTimeMillis());
        final Julkaisu julkaisu = converter.toObject(mockResultSet(1L, xml, muutosPvm));
        assertNotNull(julkaisu);
        assertEquals("Julkaisu julkaisuTyyppi should match!", "A1", julkaisu.getJulkaisuTyyppi());
        assertEquals("Julkaisu organisaatioTunnus should match!", "99999", julkaisu.getOrganisaatioTunnus());
        assertEquals("Julkaisu ilmoitusVuosi should match!", 2014, julkaisu.getIlmoitusVuosi().intValue());
    }

    @Test(expected = DataAccessException.class)
    public void testToJsonWithIOException() throws Exception {
        ObjectMapper spy = spy(new ObjectMapper());
        doThrow(new IOException("Test")).when(spy).writeValue(eq(jg), any(Dummy.class));
        ObjectConverter<Dummy> converter = new ObjectConverter<>(jg, spy, Dummy.class);
        converter.toJson(new Dummy());
    }

    private ResultSet mockResultSet(Long id, String xml, Date muutosPvm) throws SQLException {
        ResultSet resultSet = mock(ResultSet.class);
        when(resultSet.getLong(1)).thenReturn(id);
        when(resultSet.getString(2)).thenReturn(xml);
        when(resultSet.getTimestamp(3)).thenReturn(new Timestamp(muutosPvm.getTime()));
        return resultSet;
    }
}