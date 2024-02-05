package objectorientation.enumeration.overwritemethods;

public class App {
  /**
   * Chamando os metodos de enumeração e atribuindo o valor a uma constante.
   */
  public static void main(String[] args) {
    final double debitMethod = TypePayment.DEBIT.calculateDiscount(100);
    System.out.println(STR."Valor do desconto no debito: \{debitMethod}%");

    final double creditMethod = TypePayment.CREDIT.calculateDiscount(100);
    System.out.println(STR."Valor do desconto no credito: \{creditMethod}%");
  }
}
