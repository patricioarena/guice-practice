package app.repository.impl;

import java.util.HashMap;
import java.util.Map;

import com.google.inject.Singleton;

import app.enums.TypeVehicle;
import app.repository.OperationalMode;

@Singleton
public class OperationalModeImpl implements OperationalMode {

    private final Map<TypeVehicle, Boolean> vehicle = new HashMap<>();

    public OperationalModeImpl() {
        vehicle.put(TypeVehicle.CAR, true);
        vehicle.put(TypeVehicle.TRUCK, true);
        vehicle.put(TypeVehicle.MOTORCYCLE, true);
        vehicle.put(TypeVehicle.BICYCLE, false);
        vehicle.put(TypeVehicle.BUS, true);
        vehicle.put(TypeVehicle.TRACTOR_TRAILER, true);
        vehicle.put(TypeVehicle.LIGHT_SAILBOAT, false);
        vehicle.put(TypeVehicle.AIRPLANE, true);
        vehicle.put(TypeVehicle.HELICOPTER, true);
        vehicle.put(TypeVehicle.TRAIN, false);
        vehicle.put(TypeVehicle.TRAM, false);
        vehicle.put(TypeVehicle.SKATEBOARD, false);
        vehicle.put(TypeVehicle.ELECTRIC_SCOOTER, true);
        vehicle.put(TypeVehicle.SCOOTER, false);
        vehicle.put(TypeVehicle.GOLF_CART, false);
        vehicle.put(TypeVehicle.SNOWMOBILE, true);
        vehicle.put(TypeVehicle.BOAT, false);
        vehicle.put(TypeVehicle.SUBMARINE, false);
        vehicle.put(TypeVehicle.QUAD, true);
        vehicle.put(TypeVehicle.CARAVAN, false);
        vehicle.put(TypeVehicle.TRICYCLE, false);
        vehicle.put(TypeVehicle.TUKTUK, true);
        vehicle.put(TypeVehicle.AMBULANCE, true);
        vehicle.put(TypeVehicle.POLICE_CAR, true);
        vehicle.put(TypeVehicle.FIRE_TRUCK, true);
        vehicle.put(TypeVehicle.MINIVAN, true);
        vehicle.put(TypeVehicle.VAN, true);
        vehicle.put(TypeVehicle.PICKUP_TRUCK, true);
        vehicle.put(TypeVehicle.CONVERTIBLE, true);
        vehicle.put(TypeVehicle.COUPE, true);
        vehicle.put(TypeVehicle.LIMOUSINE, true);
        vehicle.put(TypeVehicle.MICROCAR, true);
        vehicle.put(TypeVehicle.HANDCART, false);
        vehicle.put(TypeVehicle.CARGO_TRICYCLE, true);
        vehicle.put(TypeVehicle.SNOW_QUAD, true);
        vehicle.put(TypeVehicle.GLIDER, false);
        vehicle.put(TypeVehicle.CANOE, false);
        vehicle.put(TypeVehicle.KAYAK, false);
        vehicle.put(TypeVehicle.JET_SKI, true);
        vehicle.put(TypeVehicle.PERSONAL_SUBMARINE, false);
        vehicle.put(TypeVehicle.MOUNTAIN_BIKE, false);
        vehicle.put(TypeVehicle.ELECTRIC_BIKE, false);
        vehicle.put(TypeVehicle.GARBAGE_TRUCK, true);
        vehicle.put(TypeVehicle.GARBAGE_TRUCK, true);
        vehicle.put(TypeVehicle.EXCAVATOR, true);
        vehicle.put(TypeVehicle.BACKHOE, true);
        vehicle.put(TypeVehicle.MOTOR_TRICYCLE, true);
        vehicle.put(TypeVehicle.ELECTRIC_GOLF_CART, true);
        vehicle.put(TypeVehicle.ELECTRIC_SHOPPING_CART, true);
        vehicle.put(TypeVehicle.HORSE_DRAWN_CARRIAGE, false);
    }

    @Override
    public Map<TypeVehicle, Boolean> get() {
        return this.vehicle;
    }
}
