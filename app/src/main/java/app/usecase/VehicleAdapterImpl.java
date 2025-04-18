package app.usecase;

import app.component.vehicle.impl.VehicleAbstractFactoryImpl;
import app.constant.enums.StateVehicle;
import app.constant.enums.TypeVehicle;
import app.model.Car;
import app.model.LightSailboat;
import app.model.Vehicle;
import jakarta.inject.Inject;
import lombok.RequiredArgsConstructor;

/**
 * Adaptador para manejar la creación de vehículos con tipos específicos.
 */
@RequiredArgsConstructor(onConstructor = @__(@Inject))
public class VehicleAdapterImpl implements VehicleAdapter {

    private final VehicleAbstractFactoryImpl factory;

    public Car createCar(StateVehicle state) {
        Vehicle vehicle = factory.apply(TypeVehicle.CAR, state);
        if (vehicle instanceof Car) {
            return (Car) vehicle;
        }
        throw new ClassCastException("El vehículo no es del tipo Car");
    }

    public LightSailboat createLightSailboat(StateVehicle state) {
        Vehicle vehicle = factory.apply(TypeVehicle.LIGHT_SAILBOAT, state);
        if (vehicle instanceof LightSailboat) {
            return (LightSailboat) vehicle;
        }
        throw new ClassCastException("El vehículo no es del tipo LightSailboat");
    }
}