package objectorientation.enumeration.constructorsandatribute;

// Ao importar a classe enum, descarta a necessidade de passar a enumeração junto ao nome da classe
import objectorientation.enumeration.constructorsandatribute.Client.TypePayment;

public class App {
  public static void main(String[] args) {
    Client clientOne = new Client("Ellen", TypeClient.PESSOA_FISICA, TypePayment.DEBIT);
    System.out.println(clientOne);

    Client clientTwo = new Client("Nicolas", TypeClient.PESSOA_JURIDICA, TypePayment.CREDIT);
    System.out.println(clientTwo);
  }
}
