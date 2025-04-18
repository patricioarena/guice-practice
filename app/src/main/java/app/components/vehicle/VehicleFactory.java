package app.components.vehicle;

import java.util.function.BiFunction;

import app.enums.StateVehicle;
import app.enums.TypeVehicle;
import app.model.Vehicle;

@FunctionalInterface
public interface VehicleFactory extends BiFunction<TypeVehicle, StateVehicle, Vehicle> {
}
