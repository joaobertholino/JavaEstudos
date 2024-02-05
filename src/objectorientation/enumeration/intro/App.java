package objectorientation.enumeration.intro;

// TODO: Revisar enumeração
// https://youtu.be/3xzrprPwS2Q?list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW
public class App {
  public static void main(String[] args) {
    Client clientOne = new Client("Nicolas", TypeClient.PESSOA_FISICA);
    System.out.println(clientOne);

    Client clientTwo = new Client("Ellen", TypeClient.PESSOA_JURIDICA);
    System.out.println(clientTwo);

    Client clientThree = new Client("Adriano", TypeClient.PESSOA_FISICA);
    System.out.println(clientThree);

    Client clientFour = new Client("Lucas", TypeClient.PESSOA_JURIDICA);
    System.out.println(clientFour);

  }
}
