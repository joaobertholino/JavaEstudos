package objectorientation.polymorphism.initone.domain;

public class Keyboard extends Product {
  public static final double TAX = 0.06;

  public Keyboard(String name, double value) {
    super(name, value);
  }

  @Override
  public double calculateTax() {
    System.out.println("Calculando importo do teclado!");
    return this.value * TAX;
  }
}
