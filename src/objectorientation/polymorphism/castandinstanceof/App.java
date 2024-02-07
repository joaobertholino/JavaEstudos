package objectorientation.polymorphism.castandinstanceof;

import objectorientation.polymorphism.castandinstanceof.domain.Computer;
import objectorientation.polymorphism.castandinstanceof.domain.Keyboard;
import objectorientation.polymorphism.castandinstanceof.domain.Product;
import objectorientation.polymorphism.castandinstanceof.services.CalculateTax;

public class App {
  public static void main(String[] args) {
    Product productOne = new Computer("Ryzen 5", 3000);
    CalculateTax.calculateTax(productOne);

    System.out.println("------------------------------------");

    Keyboard productTwo = new Keyboard("Redragon Elise", 250);
    productTwo.setKeysQuantity(56);

    CalculateTax.calculateTax(productTwo);
  }
}
