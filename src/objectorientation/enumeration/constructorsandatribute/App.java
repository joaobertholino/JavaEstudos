package objectorientation.enumeration.constructorsandatribute;

// TODO: Revisar enumeração em construtores e atributos
// TODO: https://youtu.be/gsQ1gZYh5Wo?list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW
public class App {
  public static void main(String[] args) {
    Client clientOne = new Client("Ellen", typeClient.PESSOA_FISICA, Client.typePayment.DEBIT);
    System.out.println(clientOne);

    Client clientTwo = new Client("Nicolas", typeClient.PESSOA_JURIDICA, Client.typePayment.CREDIT);
    System.out.println(clientTwo);
  }
}
