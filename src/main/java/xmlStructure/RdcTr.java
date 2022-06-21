package xmlStructure;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import xmlStructure.Product.Product;
import xmlStructure.Requisites.Requisites;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "fsa:RdcTr")
public class RdcTr {
    @XmlElement(name = "tns:Type")
    private String type;
    @XmlElement(name = "tns:Requisites")
    private Requisites requisites;
    @XmlElement(name = "tns:Applicant")
    private String applicant;
    @XmlElement(name = "tns:ApplicantUl")
    private String applicantUl;
    @XmlElement(name = "tns:ApplicantFl", nillable = true)
    private String applicantFl;
    @XmlElement(name = "tns:ApplicantAl", nillable = true)
    private Boolean ApplicantAl;
    @XmlElement(name = "tns:ApplicantAu", nillable = true)
    private Boolean ApplicantAu;
    @XmlElement(name = "tns:Manufacturer")
    private String manufacturer;
    @XmlElement(name = "tns:Product")
    private Product product;
    @XmlElement(name = "tns:DeclareAddInfo", nillable = true)
    private String declareAddInfo;
    @XmlElement(name = "tns:CertificationOrgan")
    private String certificationOrgan;
}
