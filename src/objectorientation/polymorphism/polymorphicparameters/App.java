package objectorientation.polymorphism.polymorphicparameters;

import objectorientation.polymorphism.polymorphicparameters.domain.Computer;
import objectorientation.polymorphism.polymorphicparameters.domain.Keyboard;
import objectorientation.polymorphism.polymorphicparameters.domain.Product;
import objectorientation.polymorphism.polymorphicparameters.domain.Television;
import objectorientation.polymorphism.polymorphicparameters.services.CalculateTax;

public class App {
  public static void main(String[] args) {
    Product productOne = new Computer("Ryzen 5", 3000);
    CalculateTax.calculateTax(productOne);

    System.out.println("-------------------------------");

    Product productTwo = new Keyboard("Redragon Elise", 250);
    CalculateTax.calculateTax(productTwo);

    System.out.println("-------------------------------");

    Product productThree = new Television("Samsung 45\"", 2503);
    CalculateTax.calculateTax(productThree);
  }
}
