package app.component.vehicle.impl;

import app.component.motor.Motor;
import app.component.vehicle.VehicleFactory;
import app.constant.enums.StateVehicle;
import app.constant.enums.TypeVehicle;
import app.model.LightSailboat;
import app.model.Vehicle;
import app.model.vo.State;
import com.google.inject.Inject;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(onConstructor = @__(@Inject))
public class LightSailboatFactoryImpl implements VehicleFactory {

  @Override
  public Vehicle apply(TypeVehicle typeVehicle, StateVehicle stateVehicle) {

    final var sailboat = LightSailboat.builder();
    sailboat.typeVehicle(typeVehicle.getDrivingType());
    sailboat.state(State.buildFrom(stateVehicle));

    buildEngine(typeVehicle, sailboat);

    return sailboat.build();
  }

  public void buildEngine(TypeVehicle typeVehicle, LightSailboat.LightSailboatBuilder sailboat) {
    if (typeVehicle.hasEngine()) {
      sailboat.motor(Motor.empty());
    }
    sailboat.motor(Motor.empty());
  }
}