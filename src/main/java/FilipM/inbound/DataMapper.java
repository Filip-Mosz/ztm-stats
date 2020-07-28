package FilipM.inbound;

//Utwórz pakiet inbound, a w nim klasę DataMapper, która przyjmie Stringa z jsonem i zwróci ZtmData.
// Wewnątrz użyj ObjectMapper.readValue

import FilipM.model.ZtmData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataMapper {
    public static ZtmData mapJsonToZtmData(String json) {
        ObjectMapper objectMapper = new ObjectMapper();
        ZtmData ztmData = null;
        try {
            ztmData = objectMapper.readValue(json, ZtmData.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return ztmData;
    }
}
