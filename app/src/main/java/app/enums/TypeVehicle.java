package app.enums;

public enum TypeVehicle {
  CAR(1, true, "terrestre"),
  TRUCK(2, true, "terrestre"),
  MOTORCYCLE(3, true, "terrestre"),
  BICYCLE(4, false, "terrestre"),
  BUS(5, true, "terrestre"),
  TRACTOR_TRAILER(6, true, "terrestre"),
  LIGHT_SAILBOAT(7, false, "acuática"),
  AIRPLANE(8, true, "aérea"),
  HELICOPTER(9, true, "aérea"),
  TRAIN(10, true, "terrestre"),
  TRAM(11, true, "terrestre"),
  SKATEBOARD(12, false, "terrestre"),
  ELECTRIC_SCOOTER(13, true, "terrestre"),
  SCOOTER(14, false, "terrestre"),
  GOLF_CART(15, true, "terrestre"),
  SNOWMOBILE(16, true, "terrestre"),
  BOAT(17, true, "acuática"),
  SUBMARINE(18, true, "acuática"),
  QUAD(19, true, "terrestre"),
  CARAVAN(20, false, "terrestre"),
  TRICYCLE(21, false, "terrestre"),
  TUKTUK(22, true, "terrestre"),
  AMBULANCE(23, true, "terrestre"),
  POLICE_CAR(24, true, "terrestre"),
  FIRE_TRUCK(25, true, "terrestre"),
  MINIVAN(26, true, "terrestre"),
  VAN(27, true, "terrestre"),
  PICKUP_TRUCK(28, true, "terrestre"),
  CONVERTIBLE(29, true, "terrestre"),
  COUPE(30, true, "terrestre"),
  LIMOUSINE(31, true, "terrestre"),
  MICROCAR(32, true, "terrestre"),
  HANDCART(33, false, "terrestre"),
  CARGO_TRICYCLE(34, false, "terrestre"),
  SNOW_QUAD(35, true, "terrestre"),
  GLIDER(36, false, "aérea"),
  CANOE(37, false, "acuática"),
  KAYAK(38, false, "acuática"),
  JET_SKI(39, true, "acuática"),
  PERSONAL_SUBMARINE(40, true, "acuática"),
  MOUNTAIN_BIKE(41, false, "terrestre"),
  ELECTRIC_BIKE(42, true, "terrestre"),
  GARBAGE_TRUCK(43, true, "terrestre"),
  EXCAVATOR(44, true, "terrestre"),
  BACKHOE(45, true, "terrestre"),
  MOTOR_TRICYCLE(46, true, "terrestre"),
  ELECTRIC_GOLF_CART(47, true, "terrestre"),
  ELECTRIC_SHOPPING_CART(48, true, "terrestre"),
  HORSE_DRAWN_CARRIAGE(49, false, "terrestre");

  private final int id;
  private final boolean hasEngine;
  private final String drivingType;

  TypeVehicle(int id, boolean hasEngine, String drivingType) {
    this.id = id;
    this.hasEngine = hasEngine;
    this.drivingType = drivingType;
  }

  public int getId() {
    return id;
  }

  public boolean hasEngine() {
    return hasEngine;
  }

  public String getDrivingType() {
    return drivingType;
  }
}