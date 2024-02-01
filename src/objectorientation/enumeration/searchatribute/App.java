package objectorientation.enumeration.searchatribute;

// TODO: Revisar e treinar enumerações
public class App {
  public static void main(String[] args) {
    Client clientOne = new Client("Ellen", TypeClient.PESSOA_FISICA, TypePayment.DEBIT);
    System.out.println(clientOne);

    Client clientTwo = new Client("Nicolas", TypeClient.PESSOA_JURIDICA, TypePayment.CREDIT);
    System.out.println(clientTwo);

    final double debitMethod = TypePayment.DEBIT.calculateDiscount(100);
    System.out.println(debitMethod);

    final double creditMethod = TypePayment.CREDIT.calculateDiscount(100);
    System.out.println(creditMethod);

    TypeClient typeClientOne = TypeClient.valueOf("PESSOA_FISICA");
    System.out.println(typeClientOne);

    TypeClient typeClientTwo = TypeClient.searchForNameReport("Pessoa Fisica");
    System.out.println(typeClientTwo);

    TypeClient typeClientThree = TypeClient.searchForNameReport("Valor invalido");
    System.out.println(typeClientThree);
  }
}
