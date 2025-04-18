package app.repository;

import java.util.Map;
import java.util.function.Supplier;

import app.enums.TypeVehicle;

/**
 * Map<TypeVehicle, Boolean> representa el vehiculo y si utiliza un motor.
 */
@FunctionalInterface
public interface OperationalMode extends Supplier<Map<TypeVehicle, Boolean>> {

}
