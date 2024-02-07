package poo.polymorphism.operation.domain;

public class Computer extends Product {
  public static final double TAX_PERCENT = 0.21;

  public Computer(String name, double value) {
    super(name, value);
  }

  @Override
  public double calculateTaxPercent() {
    System.out.println("Calculando importo do computador!");
    return this.value * TAX_PERCENT;
  }
}
