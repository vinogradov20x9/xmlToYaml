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
@XmlRootElement(name = "tns:Requisites")
public class Requisites {
    @XmlElement(name = "tns:Status")
    private String status;
    @XmlElement(name = "tns:Section")
    private String section;
    @XmlElement(name = "tns:Number")
    private String number;
    @XmlElement(name = "tns:DateReg")
    private String dateReg;
    @XmlElement(name = "tns:DateExpiry")
    private String dateExpiry;
    @XmlElement(name = "tns:NoExpiry", nillable = true)
    private String noExpiry;
    @XmlElement(name = "tns:BaseDeclaration")
    private String baseDeclaration;
    @XmlElement(name = "tns:Discontinued")
    private String discontinued;
}
