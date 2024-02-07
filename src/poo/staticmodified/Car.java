package poo.staticmodified;

public class Car {
  //    Ao definir uma propriedade como static, ela passa a ser pertencer a sua classe e não mais ao objeto instanciado
  public static double speedlimit = 250;
  private String brand;
  private double maximumSpeed;

  public Car(String brand, double maximumSpeed) {
    this.brand = brand;
    this.maximumSpeed = maximumSpeed;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public double getMaximumSpeed() {
    return maximumSpeed;
  }

  public void setMaximumSpeed(double maximumSpeed) {
    this.maximumSpeed = maximumSpeed;
  }

  public void print() {
    System.out.println("-------------------------------------");
    System.out.println(STR."Marca: \{this.brand}");
    System.out.println(STR."Velocidade Maxima: \{this.maximumSpeed}");
    System.out.println(STR."Velocidade Limite: \{Car.speedlimit}");
  }
}
