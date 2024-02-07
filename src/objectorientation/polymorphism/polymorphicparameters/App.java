package objectorientation.polymorphism.polymorphicparameters;

import objectorientation.polymorphism.polymorphicparameters.domain.*;
import objectorientation.polymorphism.polymorphicparameters.services.CalculateTax;

public class App {
  public static void main(String[] args) {
    Product productOne = new Computer("Ryzen 5", 3000);
    CalculateTax.calculateTaxProduct(productOne);

    System.out.println("-------------------------------");

    Product productTwo = new Keyboard("Redragon Elise", 250);
    CalculateTax.calculateTaxProduct(productTwo);

    System.out.println("-------------------------------");

    Product productThree = new Television("Smart TV Samsung 45\"", 2503);
    CalculateTax.calculateTaxProduct(productThree);
  }
}
