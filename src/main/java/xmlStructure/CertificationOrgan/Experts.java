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
@XmlRootElement(name = "Experts", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
public class Experts {
    @XmlElement(name = "Surname", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String surname;
    @XmlElement(name = "Name", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String name;
    @XmlElement(name = "Patronymic", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String Patronymic;
}
