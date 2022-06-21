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
@XmlRootElement(name = "tns:TechRegs")
@XmlAccessorType(XmlAccessType.FIELD)
public class TechRegs {
    @XmlElement(name = "tns:TechReg")
    private String techReg;
    @XmlElement(name = "tns:TechRegInfo")
    private boolean techRegInfo;
}
