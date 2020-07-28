package FilipM.core;

import FilipM.model.Vehicle;
import FilipM.model.VehicleDTO;
import FilipM.model.ZtmData;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;


@Getter
public class DataStorage {

    private LocalDateTime updateTime;
    private List<Vehicle> vehicle;

    public void update(ZtmData ztmData){

        updateTime = LocalDateTime.parse(ztmData.getUpdateTime() , DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        vehicle = ztmData.getVehicles()
                .stream()
                .map(DataStorage::mapVehicle)
        .collect(Collectors.toList());

        System.out.println("Updated storage at " + LocalTime.now());
    }

    private static Vehicle mapVehicle(VehicleDTO vehicleDTO){
        return new Vehicle(vehicleDTO.getLine(),vehicleDTO.getSpeed(),vehicleDTO.getDelay());
    }
}
