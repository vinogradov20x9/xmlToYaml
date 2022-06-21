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
@XmlRootElement(name = "ManufacturerUl", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
@XmlAccessorType(XmlAccessType.FIELD)
public class ManufacturerUl {
    @XmlElement(name = "OrganForm", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String organForm;
    @XmlElement(name = "FullName", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String fullName;
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
}
