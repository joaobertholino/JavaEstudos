package poo.polymorphism.polymorphicparameters.domain;

public class Keyboard extends Product {
  public static final double TAX_PERCENT = 0.06;

  public Keyboard(String name, double value) {
    super(name, value);
  }

  @Override
  public double calculateTaxPercent() {
    return this.value * TAX_PERCENT;
  }
}
