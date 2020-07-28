package FilipM.model;

//ZtmData zawierającą pola LocalDateTime oraz List<Vehicle>.


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class ZtmData {

    @JsonProperty("LastUpdateData")
    private String updateTime;
    @JsonProperty("Vehicles")
    private List<VehicleDTO> vehicleDTOList;

    public List<VehicleDTO> getVehicles() {
        return vehicleDTOList;
    }
}
