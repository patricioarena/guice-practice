package app.model;

import app.model.vo.State;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Car implements Vehicle{
    private String typeVehicle;
    private String engine;
    private State state;
}