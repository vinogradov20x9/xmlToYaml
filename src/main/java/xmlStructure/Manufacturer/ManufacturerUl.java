package xmlStructure.Manufacturer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import xmlStructure.ApplicantUl.Address;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "tns:ManufacturerUl")
@XmlAccessorType(XmlAccessType.FIELD)
public class ManufacturerUl {
    @XmlElement(name = "tns:OrganForm")
    private String organForm;
    @XmlElement(name = "tns:FullName")
    private String fullName;
    @XmlElement(name = "tns:Address")
    private Address address;
    @XmlElement(name = "tns:AddressActual")
    private String addressActual;
    @XmlElement(name = "tns:Phone")
    private String phone;
    @XmlElement(name = "tns:Fax")
    private String fax;
    @XmlElement(name = "tns:Email")
    private String email;
    @XmlElement(name = "tns:Organ")
    private boolean organ;
    @XmlElement(name = "tns:Date")
    private boolean date;
    @XmlElement(name = "tns:Ogrn")
    private String ogrn;
    @XmlElement(name = "tns:Inn")
    private String inn;
}
