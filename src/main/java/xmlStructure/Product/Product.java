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
@XmlRootElement(name = "tns:Product")
@XmlAccessorType(XmlAccessType.FIELD)
public class Product {
    @XmlElement(name = "tns:DeclareType")
    private String declareType;
    @XmlElement(name = "tns:DcOriginType")
    private String dcOriginType;
    @XmlElement(name = "tns:Name")
    private String name;
    @XmlElement(name = "tns:ProductInfo")
    private String productInfo;
    @XmlElement(name = "tns:Okp")
    private String okp;
    @XmlElement(name = "tns:OkpdText")
    private boolean okpdText;
    @XmlElement(name = "tns:Standart")
    private boolean standart;
    @XmlElement(name = "tns:SizeNumber")
    private String sizeNumber;
    @XmlElement(name = "tns:DetailsShippingDocumentation")
    private boolean detailsShippingDocumentation;
    @XmlElement(name = "tns:ContractInfo")
    private boolean contractInfo;
    @XmlElement(name = "tns:Info")
    private String info;
    @XmlElement(name = "tns:PlaceMark")
    private boolean placeMark;
    @XmlElement(name = "tns:TechRegs")
    private TechRegs techRegs;
}
