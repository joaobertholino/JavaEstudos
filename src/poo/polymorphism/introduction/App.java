package poo.polymorphism.introduction;

import poo.polymorphism.introduction.domain.Computer;
import poo.polymorphism.introduction.domain.Keyboard;
import poo.polymorphism.introduction.services.CalculateTax;

/**
 * Instanciando as classe {@code Computer} e {@code Keyboard} passando como argumento o nome e o valor dos produtos.
 * <p>
 * Chamando o método {@code calculateTaxComputer} e {@code calculateTaxKeyboard} passando como argumento as variaveis de
 * referencia as instancias das classes {@code Computer} e {@code Keyboard}.
 */
public class App {
  public static void main(String[] args) {
    Computer myComputer = new Computer("NUC10i7", 10000);
    Keyboard myKeyboard = new Keyboard("Razer Chroma", 1200);
    CalculateTax.calculateTaxComputer(myComputer);
    System.out.println("-------------------------------------");
    CalculateTax.calculateTaxKeyboard(myKeyboard);
  }
}
