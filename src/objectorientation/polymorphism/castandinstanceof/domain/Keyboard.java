package objectorientation.polymorphism.castandinstanceof.domain;

public class Keyboard extends Product {
  public static final double TAX_PERCENT = 0.06;
  public int keysQuantity;

  public Keyboard(String name, double value) {
    super(name, value);
  }

  @Override
  public double calculateTaxPercent() {
    return this.value * TAX_PERCENT;
  }

  public int getKeysQuantity() {
    return keysQuantity;
  }

  public void setKeysQuantity(int keysQuantity) {
    this.keysQuantity = keysQuantity;
  }
}
