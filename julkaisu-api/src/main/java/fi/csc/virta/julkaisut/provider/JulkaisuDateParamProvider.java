package fi.csc.virta.julkaisut.provider;

import org.glassfish.jersey.internal.inject.ExtractorException;
import org.glassfish.jersey.server.internal.LocalizationMessages;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.time.Instant;
import java.time.format.DateTimeParseException;
import java.util.Date;

/**
 * Date parameter converter provider for ISO-8601 format dates.
 */
public class JulkaisuDateParamProvider implements ParamConverterProvider {

    @Override
    public <T> ParamConverter<T> getConverter(Class<T> rawType, Type genericType, Annotation[] annotations) {
        if (rawType != Date.class) {
            return null;
        }

        return new ParamConverter<T>() {

            @Override
            public T fromString(String value) throws IllegalArgumentException {
                if (value == null) {
                    throw new IllegalArgumentException(LocalizationMessages.METHOD_PARAMETER_CANNOT_BE_NULL("value"));
                }
                try {
                    Instant parse = Instant.parse(value);
                    return rawType.cast(Date.from(parse));
                } catch (DateTimeParseException e) {
                    throw new ExtractorException(e);
                }
            }

            @Override
            public String toString(T value) throws IllegalArgumentException {
                if (value == null) {
                    throw new IllegalArgumentException(LocalizationMessages.METHOD_PARAMETER_CANNOT_BE_NULL("value"));
                }
                return value.toString();
            }

        };
    }
}
