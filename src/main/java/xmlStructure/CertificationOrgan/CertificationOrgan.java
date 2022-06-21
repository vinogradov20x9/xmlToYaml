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
@XmlRootElement(name = "CertificationOrgan", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
public class CertificationOrgan {
    @XmlElement(name = "FullName", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String fullName;
    @XmlElement(name = "Number", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String mumber;
    @XmlElement(name = "DateReg", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String dateReg;
    @XmlElement(name = "Organ", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String organ;
    @XmlElement(name = "Head", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String head;
    @XmlElement(name = "AddressLegal", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String addressLegal;
    @XmlElement(name = "Address", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String address;
    @XmlElement(name = "Phone", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String phone;
    @XmlElement(name = "Fax", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String fax;
    @XmlElement(name = "Email", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String email;
    @XmlElement(name = "Ogrn", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private boolean ogrn;
    @XmlElement(name = "Experts", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private Experts experts;
}
