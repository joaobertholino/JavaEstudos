package objectorientation.enumeration.overwritemethods;

public class App {
  public static void main(String[] args) {
    Client clientOne = new Client("Ellen", TypeClient.PESSOA_FISICA, TypePayment.DEBIT);
    System.out.println(clientOne);

    Client clientTwo = new Client("Nicolas", TypeClient.PESSOA_JURIDICA, TypePayment.CREDIT);
    System.out.println(clientTwo);

//    Chamando os metodos de enumeração e atribuindo o valor a uma constante
    final double debitMethod = TypePayment.DEBIT.calculateDiscount(100);
    System.out.println(STR."Valor do desconto no debito: \{debitMethod}");

    final double creditMethod = TypePayment.CREDIT.calculateDiscount(100);
    System.out.println(STR."Valor do desconto no credito: \{creditMethod}");
  }
}
