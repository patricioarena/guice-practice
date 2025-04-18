package app.usecase;

import app.constant.enums.StateVehicle;
import app.model.Car;
import app.model.LightSailboat;

public interface VehicleAdapter {

  Car createCar(StateVehicle state);
  LightSailboat createLightSailboat(StateVehicle state);
}
