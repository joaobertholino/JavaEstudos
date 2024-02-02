package objectorientation.polymorphism.initone.services;

import objectorientation.polymorphism.initone.domain.Computer;
import objectorientation.polymorphism.initone.domain.Keyboard;

public class CalculateTax {
  public static void calculateTaxComputer(Computer computer) {
    System.out.println("Relatorio de imposto do computador!");
    double tax = computer.calculateTax();
    System.out.println(STR."Nome do computador: \{computer.getName()}");
    System.out.println(STR."Valor do computador: \{computer.getValue()}");
    System.out.println(STR."Imposto do computador: \{tax}");
  }

  public static void calculateTaxKeyboard(Keyboard keyboard) {
    System.out.println("Relatorio de imposto do teclado!");
    double tax = keyboard.calculateTax();
    System.out.println(STR."Nome do teclado: \{keyboard.getName()}");
    System.out.println(STR."Valor do teclado: \{keyboard.getValue()}");
    System.out.println(STR."Imposto do teclado: \{tax}");
  }
}
