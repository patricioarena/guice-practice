package app.model;

import app.component.motor.Motor;
import app.model.vo.State;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Car implements Vehicle{
    private String typeVehicle;
    private Motor motor;
    private State state;
}