package app.components.vehicle.impl;

import app.components.vehicle.VehicleFactory;
import app.enums.StateVehicle;
import app.enums.TypeVehicle;
import app.model.LightSailboat;
import app.model.Vehicle;
import app.model.vo.State;
import app.repository.ConditionVehicle;
import com.google.inject.Inject;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.BooleanUtils;

@RequiredArgsConstructor(onConstructor = @__(@Inject))
public class LightSailboatFactoryImpl implements VehicleFactory {

  private final ConditionVehicle conditionVehicle;

  @Override
  public Vehicle apply(TypeVehicle typeVehicle, StateVehicle stateVehicle) {

    var sailboat = LightSailboat.builder();
    sailboat.typeVehicle(typeVehicle.getDrivingType());

    buildEngine(stateVehicle, typeVehicle, sailboat);
    buildStateVehicle(stateVehicle, sailboat);
    return sailboat.build();
  }

  public void buildEngine(StateVehicle stateVehicle, TypeVehicle typeVehicle,
      LightSailboat.LightSailboatBuilder sailboat) {
    if (BooleanUtils.isTrue(typeVehicle.hasEngine()) && StateVehicle.NEW.name()
        .equalsIgnoreCase(stateVehicle.name())) {
      sailboat.engine("Some engine");
    }
  }

  public void buildStateVehicle(StateVehicle stateVehicle,
      LightSailboat.LightSailboatBuilder sailboat) {
    Optional<State> stateOptional = conditionVehicle.get().stream()
        .filter(codition -> codition.getName().equalsIgnoreCase(stateVehicle.name()))
        .findFirst();
    stateOptional.ifPresent(sailboat::state);
  }
}
