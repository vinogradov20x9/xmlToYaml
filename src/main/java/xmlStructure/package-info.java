@XmlSchema(
        elementFormDefault = XmlNsForm.QUALIFIED,
        xmlns = {
                @XmlNs(prefix = "xsi", namespaceURI = "http://www.w3.org/2001/XMLSchema-instance"),
                @XmlNs(prefix = "tns", namespaceURI = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2"),
                @XmlNs(prefix = "fsa", namespaceURI = "urn://x-artefact-rosaccreditation-ru/rdc/1.0.2"),
        }
)
package xmlStructure;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;