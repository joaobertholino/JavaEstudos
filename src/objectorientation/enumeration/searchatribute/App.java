package objectorientation.enumeration.searchatribute;

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

//    valueOf => Retorna o valor de enumeração com base no argumento passado, sendo esse argumento uma correspondencia
//    exata ao valor de enumeração
    TypeClient typeClientOne = TypeClient.valueOf("PESSOA_FISICA");
    System.out.println(typeClientOne);

    TypeClient typeClientTwo = TypeClient.searchForNameReport("Pessoa Juridica");
    System.out.println(typeClientTwo);

    TypeClient typeClientThree = TypeClient.searchForNameReport("Valor Invalido");
    System.out.println(typeClientThree);
  }
}
