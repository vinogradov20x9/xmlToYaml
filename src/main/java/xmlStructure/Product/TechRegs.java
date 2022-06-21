package xmlStructure.Product;

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
@XmlRootElement(name = "TechRegs", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
@XmlAccessorType(XmlAccessType.FIELD)
public class TechRegs {
    @XmlElement(name = "TechReg", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String techReg;
    @XmlElement(name = "TechRegInfo", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private boolean techRegInfo;
}
