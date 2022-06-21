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
@XmlRootElement(name = "tns:Experts")
public class Experts {
    @XmlElement(name = "tns:Surname")
    private String surname;
    @XmlElement(name = "tns:Name")
    private String name;
    @XmlElement(name = "tns:Patronymic")
    private String Patronymic;
}
