package xmlStructure;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import xmlStructure.Product.Product;
import xmlStructure.RdcTr;
import xmlStructure.Requisites.Requisites;
import xmlStructure.ResponseFsaType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(ResponseFsaType.class);

        Unmarshaller unmarshaller = context.createUnmarshaller();
        ResponseFsaType responseFsaType = (ResponseFsaType) unmarshaller.unmarshal(new File("sample.xml"));
        responseFsaType.getRdcTr().getProduct().setTechRegs(null);

        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        objectMapper.writeValue(new File("output.yaml"), responseFsaType);


        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(responseFsaType, new File("output.xml"));

//        responseFsaType.getRdcTr().getProduct().setTechRegs(null);


//        Marshaller marshaller = context.createMarshaller();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//        marshaller.marshal(new ResponseFsaType(new RdcTr()), new File("output.xml"));
    }
}
