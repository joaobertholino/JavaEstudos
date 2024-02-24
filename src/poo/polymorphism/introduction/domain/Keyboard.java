package poo.polymorphism.introduction.domain;

/**
 * Declarando a classe {@code Keyboard} que extende a classe {@code Product}.
 */
public class Keyboard extends Product {
  public static final double TAX_PERCENT = 0.06;

  public Keyboard(String name, double value) {
    super(name, value);
  }

  /**
   * Implementando a sobreescrita do método {@code calculateTax} da interface {@code Taxable} na classe
   * {@code Keyboard}.
   */
  @Override
  public double calculateTaxPercent() {
    System.out.println("Calculando importo do teclado!");
    return this.value * TAX_PERCENT;
  }
}
