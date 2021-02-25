package fi.csc.virta.julkaisut.Util;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import fi.csc.virta.julkaisut.domain.DTO;

import java.io.IOException;
import java.io.OutputStream;
import java.util.function.Consumer;

public class JsonUtil {

    public static <T extends DTO> void withJsonArrayGenerator(OutputStream os, Class<T> tClass, Consumer<ObjectConverter<T>> consumer)
            throws IOException {
        ObjectMapper mapper = getMapper();
        JsonGenerator jg = getGenerator(os, mapper);
        jg.writeStartArray();

        consumer.accept(new ObjectConverter<>(jg, mapper, tClass));

        jg.writeEndArray();
        jg.flush();
        jg.close();
    }

    public static <T extends DTO> void withBeanJsonArrayGenerator(OutputStream os, Class<T> tClass, Consumer<ObjectResultSetConverter<T>> consumer)
            throws IOException {
        ObjectMapper mapper = getMapper();
        JsonGenerator jg = getGenerator(os, mapper);
        jg.writeStartArray();

        consumer.accept(new ObjectResultSetConverter<>(jg, mapper, tClass));

        jg.writeEndArray();
        jg.flush();
        jg.close();
    }

    public static <T extends DTO> void withBeanJsonGenerator(OutputStream os, Class<T> tClass, Consumer<ObjectResultSetConverter<T>> consumer)
            throws IOException {
        ObjectMapper mapper = getMapper();
        JsonGenerator jg = getGenerator(os, mapper);
        consumer.accept(new ObjectResultSetConverter<>(jg, mapper, tClass));
        jg.flush();
        jg.close();
    }

    public static void withJSONRawConverter(OutputStream os, Consumer<JsonRawConverter> consumer) throws IOException {
        ObjectMapper mapper = getMapper();
        JsonGenerator jg = getGenerator(os, mapper);
        consumer.accept(new JsonRawConverter(jg));
        jg.flush();
        jg.close();
    }

    private static ObjectMapper getMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        return objectMapper;
    }

    private static JsonGenerator getGenerator(OutputStream os, ObjectMapper mapper) throws IOException {
        return mapper.getFactory()
                .createGenerator(os, JsonEncoding.UTF8);
    }
}
