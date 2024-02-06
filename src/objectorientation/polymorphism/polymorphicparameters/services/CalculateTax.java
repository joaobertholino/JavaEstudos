package objectorientation.polymorphism.polymorphicparameters.services;

import objectorientation.polymorphism.polymorphicparameters.domain.Product;

public class CalculateTax {
  public static void calculateTax(Product product) {
    System.out.println("Relatorio de imposto!");
    double taxPercentCalculated = product.calculateTaxPercent();
    System.out.println(STR."Nome do produto: \{product.getName()}");
    System.out.println(STR."Valor do produto: \{product.getValue()}");
    System.out.println(STR."Imposto do produto: \{taxPercentCalculated}");
  }
}
