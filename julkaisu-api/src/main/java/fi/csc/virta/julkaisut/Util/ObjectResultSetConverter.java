package fi.csc.virta.julkaisut.Util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import fi.csc.virta.julkaisut.domain.DTO;
import org.apache.commons.dbutils.BasicRowProcessor;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ObjectResultSetConverter<T extends DTO> extends ObjectConverter<T> {

    private BasicRowProcessor rowProcessor = new BasicRowProcessor();

    public ObjectResultSetConverter(JsonGenerator jsonGenerator, ObjectMapper mapper, Class<T> tClass) {
        super(jsonGenerator, mapper, tClass);
    }

    @Override
    public T toObject(ResultSet rs) throws SQLException {
        return rowProcessor.toBean(rs, tClass);
    }
}
