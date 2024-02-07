package poo.polymorphism.operation.domain;

public class Keyboard extends Product {
  public static final double TAX_PERCENT = 0.06;

  /**
   * Declarando método que pertence somente a sub classe {@code Keyboard}, não podendo ser acessado pela super classe.
   */
  public final boolean KEYS_LIGHTNING = true;

  public Keyboard(String name, double value) {
    super(name, value);
  }

  @Override
  public double calculateTaxPercent() {
    System.out.println("Calculando importo do teclado!");
    return this.value * TAX_PERCENT;
  }

  public boolean isKEYS_LIGHTNING() {
    return KEYS_LIGHTNING;
  }
}
