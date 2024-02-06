package objectorientation.polymorphism.introduction.domain;

/**
 * Declarando a classe {@code Computer} que extende a classe {@code Product}.
 */
public class Computer extends Product {
  public static final double TAX_PERCENT = 0.21;

  public Computer(String name, double value) {
    super(name, value);
  }

  /**
   * Implementando a sobreescrita do método {@code calculateTax} da interface {@code Taxable} na classe {@code Computer}.
   */
  @Override
  public double calculateTaxPercent() {
    System.out.println("Calculando importo do computador!");
    return this.value * TAX_PERCENT;
  }
}
