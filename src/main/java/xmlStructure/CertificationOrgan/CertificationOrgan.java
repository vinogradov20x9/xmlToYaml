package xmlStructure.CertificationOrgan;

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
@XmlRootElement(name = "tns:CertificationOrgan")
public class CertificationOrgan {
    @XmlElement(name = "tns:FullName")
    private String fullName;
    @XmlElement(name = "tns:Number")
    private String mumber;
    @XmlElement(name = "tns:DateReg")
    private String dateReg;
    @XmlElement(name = "tns:Organ")
    private String organ;
    @XmlElement(name = "tns:Head")
    private String head;
    @XmlElement(name = "tns:AddressLegal")
    private String addressLegal;
    @XmlElement(name = "tns:Address")
    private String address;
    @XmlElement(name = "tns:Phone")
    private String phone;
    @XmlElement(name = "tns:Fax")
    private String fax;
    @XmlElement(name = "tns:Email")
    private String email;
    @XmlElement(name = "tns:Ogrn")
    private boolean ogrn;
    @XmlElement(name = "tns:Experts")
    private Experts experts;
}
