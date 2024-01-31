package objectorientation.enumeration.constructorsandatribute;

public class Client {
  /**
   * É possivel criar um bloco de codigo enum dentro de uma classe, porem não é aconselhavel
   * podendo tambem ter qualquer modificador de acesso.
   */
  public enum typePayment{
    DEBIT,
    CREDIT
  }
  private final String name;
  private final typeClient typeClient;
  private final typePayment typePayment;

  public Client(String name, objectorientation.enumeration.constructorsandatribute.typeClient typeClient, Client.typePayment typePayment) {
    this.name = name;
    this.typeClient = typeClient;
    this.typePayment = typePayment;
  }

  @Override
  public String toString() {
    return STR."Client{name='\{name}\{'\''}, typeClient=\{typeClient}, typeClientInt=\{typeClient.VALUE}, typePayment=\{typePayment}\{'}'}";
  }
}
