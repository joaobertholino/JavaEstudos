package objectorientation.polymorphism.introduction.domain;

/**
 * Declarando uma classe abstrata {@code Product} que implementa a interface {@code Taxable}.
 * <p>
 * Sendo a classe {@code Product} abstrata, pelo fato dessa classe dar origem a novas classe concretas de produtos.
 */
public abstract class Product implements Taxable {
  protected String name;
  protected double value;

  public Product(String name, double value) {
    this.name = name;
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public double getValue() {
    return value;
  }
}
