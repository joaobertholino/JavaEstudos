package objectorientation.enumeration.intro;

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
