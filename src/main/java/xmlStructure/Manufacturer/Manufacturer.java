package xmlStructure.Manufacturer;

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
@XmlRootElement(name = "Manufacturer", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
@XmlAccessorType(XmlAccessType.FIELD)
public class Manufacturer {
    @XmlElement(name = "Type", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String type;
    @XmlElement(name = "ManufacturerUl", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private ManufacturerUl manufacturerUl;
    @XmlElement(name = "ManufacturerAl", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private boolean manufacturerAl;
    @XmlElement(name = "ManufacturerFl", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private boolean manufacturerFl;
}
