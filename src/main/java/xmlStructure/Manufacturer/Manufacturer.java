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
@XmlRootElement(name = "tns:Manufacturer")
@XmlAccessorType(XmlAccessType.FIELD)
public class Manufacturer {
    @XmlElement(name = "tns:Type")
    private String type;
    @XmlElement(name = "tns:ManufacturerUl")
    private ManufacturerUl manufacturerUl;
    @XmlElement(name = "tns:ManufacturerAl")
    private boolean manufacturerAl;
    @XmlElement(name = "tns:ManufacturerFl")
    private boolean manufacturerFl;
}
