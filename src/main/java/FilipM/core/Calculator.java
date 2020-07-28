package FilipM.core;

import FilipM.model.Vehicle;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Calculator {

    public static Double avgSpeed(List<Vehicle> vehicles) {
        return vehicles.stream()
                .mapToDouble(Vehicle::getSpeed)
                .average()
                .orElse(0);
    }

    public static Map<String, Double> avgSpeedByLine(List<Vehicle> vehicles) {
        Map<String, Double> result = new HashMap<>();

        return vehicles.stream()
                .collect(
                        Collectors.groupingBy(Vehicle::getLine,
                                Collectors.averagingInt(Vehicle::getSpeed)));

    }

    public static Double avgSpeedForGivenLine(String line, List<Vehicle> vehicles) {
        List<Vehicle> oneLineVehicles = vehicles.stream()
                .filter(vehicle -> vehicle.getLine().equals(line))
                .collect(Collectors.toList());
        return avgSpeed(oneLineVehicles);
    }

}
