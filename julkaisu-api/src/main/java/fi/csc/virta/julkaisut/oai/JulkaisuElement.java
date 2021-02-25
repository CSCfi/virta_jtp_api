package fi.csc.virta.julkaisut.oai;

import com.lyncode.xoai.dataprovider.exceptions.WritingXmlException;
import com.lyncode.xoai.dataprovider.xml.XmlOutputContext;
import com.lyncode.xoai.dataprovider.xml.xoai.Element;
import org.codehaus.stax2.XMLStreamWriter2;

import javax.xml.stream.XMLStreamException;

public class JulkaisuElement extends Element {

    private String value;

    @Override
    public void write(XmlOutputContext context) throws WritingXmlException {
        try {
            ((XMLStreamWriter2) context.getWriter()).writeRaw(getValue());
        } catch (XMLStreamException e) {
            throw new WritingXmlException("Could not write julkaisu xml!", e);
        }
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
