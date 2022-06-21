package xmlStructure.ApplicantUl;

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
@XmlRootElement(name = "ApplicantUl", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
@XmlAccessorType(XmlAccessType.FIELD)
public class ApplicantUl {
    @XmlElement(name = "OrganForm", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String organForm;
    @XmlElement(name = "FullName", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String fullName;
    @XmlElement(name = "ShortName", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private boolean shortName;
    @XmlElement(name = "Head", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String head;
    @XmlElement(name = "HeadPost", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String headPost;
    @XmlElement(name = "HeadText", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String headText;
    @XmlElement(name = "Address", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Address address;
    @XmlElement(name = "AddressActual", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String addressActual;
    @XmlElement(name = "Phone", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String phone;
    @XmlElement(name = "Fax", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String fax;
    @XmlElement(name = "Email", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String email;
    @XmlElement(name = "Organ", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private boolean organ;
    @XmlElement(name = "Date", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private boolean date;
    @XmlElement(name = "Ogrn", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String ogrn;
    @XmlElement(name = "Inn", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String inn;
    @XmlElement(name = "RegInfo", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private boolean regInfo;
    @XmlElement(name = "Contract", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private boolean contract;
}
