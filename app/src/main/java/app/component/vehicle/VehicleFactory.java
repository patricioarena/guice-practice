package app.component.vehicle;

import java.util.function.BiFunction;

import app.constant.enums.StateVehicle;
import app.constant.enums.TypeVehicle;
import app.model.Vehicle;

@FunctionalInterface
public interface VehicleFactory extends BiFunction<TypeVehicle, StateVehicle, Vehicle> {
}
