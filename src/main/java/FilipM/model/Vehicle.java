package FilipM.model;

import lombok.Getter;

@Getter
public class Vehicle {

    public Vehicle(String line, Integer speed, Integer delay) {
        this.line = line;
        this.speed = speed;
        this.delay = delay;
    }

    private final String line;
    private final Integer speed;
    private final Integer delay;

    @Override
    public String toString() {
        return "Vehicle{" +
                "line='" + line + '\'' +
                ", speed=" + speed +
                ", delay=" + delay +
                '}';
    }
}
