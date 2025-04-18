package app.model.vo;

import app.constant.enums.StateVehicle;
import lombok.Builder;

@Builder
public record State(String name, String description) {
  public static State buildFrom(final StateVehicle stateVehicle) {
    return State.builder()
        .name(stateVehicle.getName())
        .description(stateVehicle.getDescription())
        .build();
  }
}