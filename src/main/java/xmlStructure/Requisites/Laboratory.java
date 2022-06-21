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
@XmlRootElement(name = "tns:Laboratory")
public class Laboratory {
    @XmlElement(name = "tns:NumberReg")
    private String numberReg;
    @XmlElement(name = "tns:Name")
    private String name;
    @XmlElement(name = "tns:DateReg")
    private String dateReg;
    @XmlElement(name = "tns:DateExpiry")
    private String dateExpiry;
    @XmlElement(name = "tns:Document")
    private boolean document;
    @XmlElement(name = "tns:Info")
    private boolean info;
}
