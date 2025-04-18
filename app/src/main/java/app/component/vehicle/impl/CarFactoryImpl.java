package app.component.vehicle.impl;

import app.component.vehicle.VehicleFactory;
import app.constant.enums.StateVehicle;
import app.constant.enums.TypeVehicle;
import app.model.Car;
import app.model.Vehicle;
import app.model.vo.State;
import com.google.inject.Inject;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(onConstructor = @__(@Inject))
public class CarFactoryImpl implements VehicleFactory {

  @Override
  public Vehicle apply(TypeVehicle typeVehicle, StateVehicle stateVehicle) {

    final var car = Car.builder();
    car.typeVehicle(typeVehicle.getDrivingType());
    car.state(State.buildFrom(stateVehicle));

    buildEngine(typeVehicle, car);

    return car.build();
  }

  public void buildEngine(TypeVehicle typeVehicle, Car.CarBuilder car) {
    if (typeVehicle.hasEngine()) {
      car.engine("Some engine");
    }
  }
}
