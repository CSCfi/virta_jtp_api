package fi.csc.virta.julkaisut.Util;

import fi.csc.virta.julkaisut.exception.DataAccessException;
import org.codehaus.stax2.XMLOutputFactory2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.function.Consumer;

/**
 * Util class for forming xml output streams.
 */
public class XmlUtil {

    private static final Logger log = LoggerFactory.getLogger(XmlUtil.class);

    public static void withXmlGenerator(OutputStream os, Consumer<XmlRawConverter> consumer)
            throws IOException {
        XMLStreamWriter writer = null;
        try {
            XMLOutputFactory xmlOutputFactory = XMLOutputFactory2.newInstance();
            writer = xmlOutputFactory.createXMLStreamWriter(os, "UTF-8");
            writer.setPrefix("xsi", "http://www.w3.org/2001/XMLSchema-instance");

            writer.writeStartDocument("utf-8", "1.0");
            writer.writeStartElement("Julkaisut");
            writer.writeDefaultNamespace("urn:mace:funet.fi:julkaisut/2015/03/01");
            writer.writeNamespace("xsi", "http://www.w3.org/2001/XMLSchema-instance");
            writer.writeAttribute("http://www.w3.org/2001/XMLSchema-instance", "schemaLocation",
                    "urn:mace:funet.fi:julkaisut/2015/03/01");

            consumer.accept(new XmlRawConverter(writer));

            writer.writeEndElement();
            writer.flush();
        } catch (XMLStreamException ex) {
            log.error("Xml stream failed!", ex);
            throw new DataAccessException("Xml stream failed!", ex);
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (XMLStreamException e) {
                log.error("Could not close xml stream!", e);
            }
        }
    }
}
