package xmlStructure;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "ResponseFsaType", namespace="urn://x-artefact-rosaccreditation-ru/rdc/1.0.2")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResponseFsaType implements Serializable {
    @XmlElement(name = "RdcTr", namespace = "urn://x-artefact-rosaccreditation-ru/rdc/1.0.2")
    private RdcTr rdcTr;
}
