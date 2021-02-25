package fi.csc.virta.julkaisut.oai;

import com.lyncode.xoai.dataprovider.OAIDataProvider;
import com.lyncode.xoai.dataprovider.OAIRequestParameters;
import com.lyncode.xoai.dataprovider.core.Granularity;
import com.lyncode.xoai.dataprovider.core.XOAIManager;
import com.lyncode.xoai.dataprovider.exceptions.InvalidContextException;
import com.lyncode.xoai.dataprovider.exceptions.OAIException;
import com.lyncode.xoai.dataprovider.exceptions.WritingXmlException;
import com.lyncode.xoai.dataprovider.services.api.ItemRepository;
import com.lyncode.xoai.dataprovider.services.api.RepositoryConfiguration;
import com.lyncode.xoai.dataprovider.services.api.ResumptionTokenFormatter;
import com.lyncode.xoai.dataprovider.services.api.SetRepository;
import com.lyncode.xoai.dataprovider.services.impl.BaseDateProvider;
import com.lyncode.xoai.dataprovider.xml.XmlOutputContext;
import org.codehaus.stax2.XMLOutputFactory2;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import java.io.OutputStream;
import java.util.List;

public class JulkaisuOAIDataProvider extends OAIDataProvider {

    public JulkaisuOAIDataProvider(XOAIManager manager, String contextUrl, RepositoryConfiguration identify, SetRepository setRepository, ItemRepository itemRepository) throws InvalidContextException {
        super(manager, contextUrl, identify, setRepository, itemRepository);
    }

    public JulkaisuOAIDataProvider(XOAIManager manager, String contexturl, RepositoryConfiguration identify, SetRepository setRepository, ItemRepository itemRepository, ResumptionTokenFormatter format) throws InvalidContextException {
        super(manager, contexturl, identify, setRepository, itemRepository, format);
    }

    public JulkaisuOAIDataProvider(XOAIManager manager, String contexturl, RepositoryConfiguration identify, SetRepository setRepository, ItemRepository itemRepository, List<String> compressions) throws InvalidContextException {
        super(manager, contexturl, identify, setRepository, itemRepository, compressions);
    }

    @Override
    public void handle(OAIRequestParameters params, OutputStream out) throws OAIException, XMLStreamException, WritingXmlException {
        XMLOutputFactory xmlOutputFactory = XMLOutputFactory2.newInstance();
        XmlOutputContext context = new XmlOutputContext(new BaseDateProvider(),
                xmlOutputFactory.createXMLStreamWriter(out), Granularity.Second);

        // this is for testing
        //xmlOutputFactory.setProperty(XMLOutputFactory.IS_REPAIRING_NAMESPACES, true);
        
        context.getWriter().writeStartDocument();
        this.handle(params).write(context);
        context.getWriter().writeEndDocument();
        context.getWriter().flush();
        context.getWriter().close();
    }
}
