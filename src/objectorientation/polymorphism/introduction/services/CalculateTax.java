package objectorientation.polymorphism.introduction.services;

import objectorientation.polymorphism.introduction.domain.Computer;
import objectorientation.polymorphism.introduction.domain.Keyboard;

/**
 * Declarando classe {@code CalculateTax} onde terá dois métodos estaticos {@code calculateTaxComputer} e
 * {@code calculateTaxKeyboard}, que serão reponsaveis por executar a lógica feita nas classes {@code Product},
 * {@code Computer}, {@code Keyboard} e na interface {@code Taxable}.
 * <p>
 * São declarados como estaticos pois com eles não será acessado nenhum atributo de classe.
 */
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
