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
@XmlRootElement(name = "Product", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
@XmlAccessorType(XmlAccessType.FIELD)
public class Product {
    @XmlElement(name = "DeclareType", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String declareType;
    @XmlElement(name = "DcOriginType", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String dcOriginType;
    @XmlElement(name = "Name", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String name;
    @XmlElement(name = "ProductInfo", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String productInfo;
    @XmlElement(name = "Okp", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String okp;
    @XmlElement(name = "OkpdText", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private boolean okpdText;
    @XmlElement(name = "Standart", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private boolean standart;
    @XmlElement(name = "SizeNumber", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String sizeNumber;
    @XmlElement(name = "DetailsShippingDocumentation", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private boolean detailsShippingDocumentation;
    @XmlElement(name = "ContractInfo", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private boolean contractInfo;
    @XmlElement(name = "Info", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private String info;
    @XmlElement(name = "PlaceMark", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private boolean placeMark;
    @XmlElement(name = "TechRegs", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/commons/1.0.2")
    private TechRegs techRegs;
}
