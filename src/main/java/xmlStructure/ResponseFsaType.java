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
@XmlRootElement(name = "fsa:ResponseFsaType")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResponseFsaType implements Serializable {
    @XmlElement(name = "fsa:RdcTr")
    private Object rdcTr;
}
