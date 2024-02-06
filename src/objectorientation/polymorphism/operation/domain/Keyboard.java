package objectorientation.polymorphism.operation.domain;

public class Keyboard extends Product {
  public static final double TAX_PERCENT = 0.06;
  public final boolean isKeysLighting = true;

  public Keyboard(String name, double value) {
    super(name, value);
  }

  @Override
  public double calculateTaxPercent() {
    System.out.println("Calculando importo do teclado!");
    return this.value * TAX_PERCENT;
  }

  public boolean getIsKeysLighting() {
    return isKeysLighting;
  }
}
