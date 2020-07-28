package FilipM.model;

// Utwórz klasę Vehicle z polami: line, speed,delay. Używając adnotacji @JsonIgnoreProperties oraz
// @JsonProperty dopasuj pola odpowiednio do struktry pliku json spod adresu
// "https://ckan2.multimediagdansk.pl/gpsPositions". Są to adnotacje z dependencji której użyliśmy.

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class VehicleDTO {

    @JsonProperty("Line")
    private String line;
    @JsonProperty("Speed")
    private Integer speed;
    @JsonProperty("Delay")
    private Integer delay;



}
