package xmlStructure.Requisites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "tns:BaseDeclaration")
public class BaseDeclaration {
    @XmlElement(name = "tns:Documents")
    private String documents;
    @XmlElement(name = "tns:Schema")
    private String schema;
    @XmlElement(name = "tns:Base")
    private Base base;
    @XmlElement(name = "tns:Laboratory")
    private Laboratory laboratory;
}
