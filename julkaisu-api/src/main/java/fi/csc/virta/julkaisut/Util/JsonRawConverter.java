package fi.csc.virta.julkaisut.Util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import fi.csc.virta.julkaisut.exception.DataAccessException;
import org.json.JSONObject;
import org.json.XML;

import java.io.IOException;

public class JsonRawConverter implements RawConverter {

    private JsonGenerator jg;
    private long count = 0;

    public JsonRawConverter(JsonGenerator jg) {
        this.jg = jg;
    }

    @Override
    public void convert(String value) {
        JSONObject json = XML.toJSONObject(value);
        try {
            jg.writeRaw(new SerializedString(json.getJSONObject("Julkaisu").toString()));
            count++;
        } catch (IOException e) {
            throw new DataAccessException("Could not convert xml to json!", e);
        }
    }

    @Override
    public long getCount() {
        return count;
    }
}
