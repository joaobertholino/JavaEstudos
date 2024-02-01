package objectorientation.enumeration.constructorsandatribute;

// TODO: Revisar enumereção contrutores e atributos
// TODO: https://youtu.be/gsQ1gZYh5Wo?list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW
public class App {
  public static void main(String[] args) {
    Client clientOne = new Client("Ellen", TypeClient.PESSOA_FISICA, Client.TypePayment.DEBIT);
    System.out.println(clientOne);

    Client clientTwo = new Client("Nicolas", TypeClient.PESSOA_JURIDICA, Client.TypePayment.CREDIT);
    System.out.println(clientTwo);
  }
}
