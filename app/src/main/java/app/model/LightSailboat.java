package app.model;

import app.component.motor.Motor;
import app.model.vo.State;
import lombok.Builder;

@Builder
public record LightSailboat(String typeVehicle, Motor motor, State state)
    implements Vehicle {}
