package objectorientation.polymorphism.initone;

// TODO: Revisar polimorfismo

import objectorientation.polymorphism.initone.domain.Computer;
import objectorientation.polymorphism.initone.domain.Keyboard;
import objectorientation.polymorphism.initone.services.CalculateTax;

public class App {
  public static void main(String[] args) {
    Computer myComputer = new Computer("NUC10i7", 10000);
    Keyboard myKeyboard = new Keyboard("Razer Chroma", 1200);
    CalculateTax.calculateTaxComputer(myComputer);
    System.out.println("-------------------------------------");
    CalculateTax.calculateTaxKeyboard(myKeyboard);
  }
}
