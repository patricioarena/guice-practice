package app.components.vehicle.impl;

import app.components.vehicle.VehicleFactory;
import app.enums.StateVehicle;
import app.enums.TypeVehicle;
import app.model.Car;
import app.model.Vehicle;
import app.model.vo.State;
import app.repository.ConditionVehicle;
import com.google.inject.Inject;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.BooleanUtils;

@RequiredArgsConstructor(onConstructor = @__(@Inject))
public class CarFactoryImpl implements VehicleFactory {

  private final ConditionVehicle conditionVehicle;

  @Override
  public Vehicle apply(TypeVehicle typeVehicle, StateVehicle stateVehicle) {

    var car = Car.builder();
    car.typeVehicle(typeVehicle.getDrivingType());

    buildEngine(stateVehicle, typeVehicle, car);
    buildStateVehicle(stateVehicle, car);
    return car.build();
  }

  public void buildEngine(StateVehicle stateVehicle, TypeVehicle typeVehicle, Car.CarBuilder car) {
    if (BooleanUtils.isTrue(typeVehicle.hasEngine()) && StateVehicle.NEW.name()
        .equalsIgnoreCase(stateVehicle.name())) {
      car.engine("Some engine");
    }
  }

  public void buildStateVehicle(StateVehicle stateVehicle, Car.CarBuilder car) {
    Optional<State> stateOptional = conditionVehicle.get().stream()
        .filter(codition -> codition.getName().equalsIgnoreCase(stateVehicle.name()))
        .findFirst();
    stateOptional.ifPresent(car::state);
  }
}
