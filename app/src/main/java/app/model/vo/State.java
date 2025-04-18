package app.model.vo;

import app.constant.enums.StateVehicle;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class State {

  private String name;
  private String description;

  public static State buildFrom(StateVehicle stateVehicle) {
    return State.builder()
        .name(stateVehicle.getName())
        .description(stateVehicle.getDescription())
        .build();
  }
}