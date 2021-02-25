package fi.csc.virta.julkaisut.Util;

import fi.csc.virta.julkaisut.exception.DataAccessException;
import org.codehaus.stax2.XMLStreamWriter2;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class XmlRawConverter implements RawConverter {

    private XMLStreamWriter writer;
    private long count = 0;

    public XmlRawConverter(XMLStreamWriter writer) {
        this.writer = writer;
    }

    @Override
    public void convert(String value) {
        try {
            ((XMLStreamWriter2) writer).writeRaw(value);
            count++;
        } catch (XMLStreamException e) {
            throw new DataAccessException("Reading xml data failed!", e);
        }
    }

    @Override
    public long getCount() {
        return count;
    }
}
