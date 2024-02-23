package poo.polymorphism.castandinstanceof.services;

import poo.polymorphism.castandinstanceof.domain.Keyboard;
import poo.polymorphism.castandinstanceof.domain.Product;

/**
 * Verificando se o objeto mais generico passado como argumento é uma instancia de (instanceOf) uma classe mais espessifica.
 */
public class CalculateTax {
  public static void calculateTax(Product product) {
    System.out.println("Relatorio do produto:");
    System.out.println(STR."Nome do produto: \{product.getName()}");
    System.out.println(STR."Valor do produto: \{product.getValue()}");
    System.out.println(STR."Imposto do produto: \{product.calculateTaxPercent()}");

    if (product instanceof Keyboard myKeyboard) {
      System.out.println(STR."Qnt. de teclas do teclado: \{myKeyboard.getKeysQuantity()}");
    }
  }
}
