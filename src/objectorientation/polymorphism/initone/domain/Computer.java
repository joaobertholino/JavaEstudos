package objectorientation.polymorphism.initone.domain;

public class Computer extends Product {
  public static final double TAX = 0.21;

  public Computer(String name, double value) {
    super(name, value);
  }

  @Override
  public double calculateTax() {
    System.out.println("Calculando importo do computador!");
    return this.value * TAX;
  }

}
