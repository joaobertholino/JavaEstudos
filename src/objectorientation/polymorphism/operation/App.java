package objectorientation.polymorphism.operation;

import objectorientation.polymorphism.operation.domain.Computer;
import objectorientation.polymorphism.operation.domain.Keyboard;
import objectorientation.polymorphism.operation.domain.Product;

/**
 * Mesmo tipo de variavel de referancia {@code Product} qua faz referencia a objetos diferentes, podendo acessar seus
 * métodos desde que os mesmos estejam sendo herdados da super classe para a sub classe.
 * <p>
 * Para acessar um método da sub classe não herdados da super classe, é necessario criar uma nova variavel de referencia
 * com o tipo desse objeto.
 * <p>
 * Widening Cast => Um tipo mais generico faz referencia a um tipo mais especifico, ou seja, um tipo de super classe faz
 * referencia a um objeto de uma sub classe, a qual extente a super classe.
 */
public class App {
  public static void main(String[] args) {
    Product productOne = new Computer("Ryzen 5", 3000);
    System.out.println(productOne.getName());
    System.out.println(productOne.getValue());

    System.out.println("---------------------------------------");

    Product productTwo = new Keyboard("Redragon Elise", 250);
    System.out.println(productTwo.getName());
    System.out.println(productTwo.getValue());
    System.out.println(productTwo.calculateTaxPercent());

    System.out.println("---------------------------------------");

    Keyboard myKeyboard = new Keyboard("Razer Chroma", 1500);
    System.out.println(myKeyboard.isKEYS_LIGHTNING());
  }
}
