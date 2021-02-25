package fi.csc.virta.julkaisut.Util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import fi.csc.virta.julkaisut.domain.DTO;
import fi.csc.virta.julkaisut.exception.DataAccessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.StringReader;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Converter for transforming {@link ResultSet} to Object and Object to Json.
 */
public class ObjectConverter<T extends DTO> implements CountingConverter {

    private final Logger log = LoggerFactory.getLogger(getClass());

    private JsonGenerator jsonGenerator;
    private ObjectMapper mapper;
    private Unmarshaller unmarshaller;
    private long count = 0;

    protected Class<T> tClass;

    public ObjectConverter(JsonGenerator jsonGenerator, ObjectMapper mapper, Class<T> tClass) {
        this.jsonGenerator = jsonGenerator;
        this.mapper = mapper;
        this.tClass = tClass;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(tClass);
            unmarshaller = jaxbContext.createUnmarshaller();
        } catch (JAXBException ex) {
            log.error("Could not create unmarshaller!", ex);
        }
    }

    /**
     * Convert given object to json and writes it to stream.
     *
     * @param o Object to convert.
     */
    public boolean toJson(T o) {
        try {
            mapper.writeValue(jsonGenerator, o);
            count++;
            return true;
        } catch (IOException e) {
            throw new DataAccessException("Can not convert object to JSON!", e);
        }
    }

    /**
     * Convert {@link ResultSet} row to object.
     *
     * @param resultSet Sql resultset
     * @return new object instance
     * @throws SQLException if database access fails.
     */
    public T toObject(ResultSet resultSet) throws SQLException {
        try {
            T dto = (T) unmarshaller.unmarshal(new StringReader(resultSet.getString(2)));
            dto.setId(resultSet.getLong(1));
            dto.setMuutospvm(resultSet.getTimestamp(3));
            dto.setLuontipvm(resultSet.getTimestamp(4));
            return dto;
        } catch (JAXBException e) {
            log.error("Unmarshalling failed!", e);
        }
        return null;
    }

    @Override
    public long getCount() {
        return count;
    }
}
