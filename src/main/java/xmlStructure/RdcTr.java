package xmlStructure;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import xmlStructure.Applicant.Applicant;
import xmlStructure.ApplicantUl.ApplicantUl;
import xmlStructure.CertificationOrgan.CertificationOrgan;
import xmlStructure.Manufacturer.Manufacturer;
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
@XmlRootElement(name = "RdcTr", namespace="urn://x-artefact-rosaccreditation-ru/rdc/1.0.2")
public class RdcTr {
    @XmlElement(name = "Type", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String type;
    @XmlElement(name = "Requisites", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Requisites requisites;
    @XmlElement(name = "Applicant", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Applicant applicant;
    @XmlElement(name = "ApplicantUl", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private ApplicantUl applicantUl;
    @XmlElement(name = "ApplicantFl", nillable = true, namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String applicantFl;
    @XmlElement(name = "ApplicantAl", nillable = true, namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Boolean ApplicantAl;
    @XmlElement(name = "ApplicantAu", nillable = true, namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Boolean ApplicantAu;
    @XmlElement(name = "Manufacturer", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Manufacturer manufacturer;
    @XmlElement(name = "Product", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Product product;
    @XmlElement(name = "DeclareAddInfo", nillable = true, namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String declareAddInfo;
    @XmlElement(name = "CertificationOrgan", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private CertificationOrgan certificationOrgan;
}
