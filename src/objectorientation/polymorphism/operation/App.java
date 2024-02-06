package objectorientation.polymorphism.operation;

import objectorientation.polymorphism.operation.domain.Computer;
import objectorientation.polymorphism.operation.domain.Keyboard;
import objectorientation.polymorphism.operation.domain.Product;

/**
 * Mesmo tipo de variavel de referancia {@code Product} qua faz referencia a objetos diferentes, podendo acessar seus
 * métodos desde que os mesmos estejam sendo herdados da super classe para a sub classe.
 * <p>
 * Para acessar um método da sub classe não herdade da super classe, é necessario criar uma nova variavel de referencia
 * a esse objeto.
 */
public class App {
  public static void main(String[] args) {
    Product productOne = new Computer("Ryzen 5", 3000);
    System.out.println(productOne.getName());
    System.out.println(productOne.getValue());
    System.out.println(productOne.calculateTaxPercent());

    System.out.println("---------------------------------------");

    Product productTwo = new Keyboard("Redragon Elise", 250);
    System.out.println(productTwo.getName());
    System.out.println(productTwo.getValue());
    System.out.println(productTwo.calculateTaxPercent());

    System.out.println("---------------------------------------");

    Keyboard myKeyboard = new Keyboard("Razer Chroma", 1500);
    System.out.println(myKeyboard.getIsKeysLighting());
  }
}
