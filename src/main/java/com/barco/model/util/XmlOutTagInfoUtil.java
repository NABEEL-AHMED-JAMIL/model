package com.barco.model.util;

import com.barco.model.dto.request.ConfigurationMakerRequest;
import com.barco.model.dto.request.TagInfoRequest;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;

/**
 * @author Nabeel Ahmed
 */
@Component
public class XmlOutTagInfoUtil {

    private final Logger logger = LoggerFactory.getLogger(XmlOutTagInfoUtil.class);

    private static final String BLANK = "";
    private static final String SPACE = "";
    private static final String UTF8 = "UTF-8";
    private static final String YES = "yes";
    private static final String NAME = "{http://xml.apache.org/xslt}indent-amount";
    private static final String VALUE = "2";

    public String makeXml(ConfigurationMakerRequest xmlMakerRequest) throws Exception {
        logger.info("Process For Xml Create Start");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        String xml = null;

        if (xmlMakerRequest.getXmlTagsInfo() != null) {
            Document xmlDoc = builder.newDocument();
            boolean isParent = true;

            for (TagInfoRequest tagInfoRequest : xmlMakerRequest.getXmlTagsInfo()) {
                String tagKey = tagInfoRequest.getTagKey();
                String tagParent = tagInfoRequest.getTagParent();
                String tagValue = tagInfoRequest.getTagValue();
                Element child;

                if (isParent) {
                    child = xmlDoc.createElementNS(BLANK, tagKey);
                    addTagValue(xmlDoc, child, tagValue);
                    xmlDoc.appendChild(child);
                    isParent = false;
                } else {
                    if (tagParent != null && !tagParent.equals(BLANK)) {
                        NodeList nodeList = xmlDoc.getElementsByTagName(tagParent);
                        if (nodeList != null && nodeList.getLength() > 0) {
                            Node node = nodeList.item(nodeList.getLength() - 1);
                            if (node != null && tagKey != null && !tagKey.equals(BLANK)) {
                                child = xmlDoc.createElement(tagKey);
                                addTagValue(xmlDoc, child, tagValue);
                                node.appendChild(child);
                            }
                        } else {
                            Element parent = xmlDoc.createElement(tagParent);
                            if (tagKey != null && !tagKey.equals(BLANK)) {
                                child = xmlDoc.createElement(tagKey);
                                addTagValue(xmlDoc, child, tagValue);
                                parent.appendChild(child);
                                xmlDoc.getDocumentElement().appendChild(parent);
                            }
                        }
                    } else {
                        child = xmlDoc.createElement(tagKey);
                        addTagValue(xmlDoc, child, tagValue);
                        xmlDoc.getDocumentElement().appendChild(child);
                    }
                }
            }

            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, UTF8);
            transformer.setOutputProperty(OutputKeys.INDENT, YES);
            transformer.setOutputProperty(NAME, VALUE);
            DOMSource source = new DOMSource(xmlDoc);
            StringWriter writer = new StringWriter();
            StreamResult result = new StreamResult(writer);
            transformer.transform(source, result);
            xml = result.getWriter().toString();
        }

        logger.info("Process For Xml Create End");
        return xml;
    }

    private void addTagValue(Document xmlDoc, Element child, String tagValue) {
        if (tagValue != null && !tagValue.equals(BLANK)) {
            child.appendChild(xmlDoc.createTextNode(tagValue));
        } else {
            child.appendChild(xmlDoc.createTextNode(SPACE));
        }
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
