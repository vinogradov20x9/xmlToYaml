package xmlStructure.Applicant;

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
@XmlRootElement(name = "tns:Applicant")
@XmlAccessorType(XmlAccessType.FIELD)
public class Applicant {
    @XmlElement(name = "tns:ApplicantType")
    private String applicantType;
    @XmlElement(name = "tns:DeclarantType")
    private String declarantType;
}
