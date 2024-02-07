package poo.polymorphism.operation.services;

import poo.polymorphism.operation.domain.Computer;
import poo.polymorphism.operation.domain.Keyboard;

public class CalculateTax {
  public static void calculateTaxComputer(Computer computer) {
    System.out.println("Relatorio de imposto do computador!");
    double taxPercentCalculated = computer.calculateTaxPercent();
    System.out.println(STR."Nome do computador: \{computer.getName()}");
    System.out.println(STR."Valor do computador: \{computer.getValue()}");
    System.out.println(STR."Imposto do computador: \{taxPercentCalculated}");
  }

  public static void calculateTaxKeyboard(Keyboard keyboard) {
    System.out.println("Relatorio de imposto do teclado!");
    double taxPercentCalculated = keyboard.calculateTaxPercent();
    System.out.println(STR."Nome do teclado: \{keyboard.getName()}");
    System.out.println(STR."Valor do teclado: \{keyboard.getValue()}");
    System.out.println(STR."Imposto do teclado: \{taxPercentCalculated}");
  }
}
