package app.component.motor;

/**
 * Representa un motor de combustión interna con propiedades específicas como
 * el número de cilindros y el tipo de combustible.
 * Extiende la clase abstracta {@link Motor}.
 */
public class CombustionMotor extends Motor {

  /**
   * Número de cilindros del motor.
   */
  private int cylinders;

  /**
   * Tipo de combustible utilizado por el motor (por ejemplo, Gasolina, Diesel).
   */
  private String fuelType;

  /**
   * Constructor para inicializar un motor de combustión con su potencia,
   * número de cilindros y tipo de combustible.
   *
   * @param power Potencia del motor en HP.
   * @param cylinders Número de cilindros del motor.
   * @param fuelType Tipo de combustible utilizado por el motor.
   */
  public CombustionMotor(int power, int cylinders, String fuelType) {
    super("Combustion", power);
    this.cylinders = cylinders;
    this.fuelType = fuelType;
  }

  /**
   * Muestra los detalles específicos del motor de combustión, incluyendo
   * su potencia, número de cilindros y tipo de combustible.
   */
  @Override
  public void showDetails() {
    System.out.println("Combustion Motor:");
    System.out.println("Power: " + power + " HP");
    System.out.println("Cylinders: " + cylinders);
    System.out.println("Fuel Type: " + fuelType);
  }
}