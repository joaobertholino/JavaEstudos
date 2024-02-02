package objectorientation.enumeration.constructorsandatribute;

public class Client {
  /**
   * É possivel criar um bloco de codigo enum dentro de uma classe, porem não é aconselhavel
   * podendo tambem ter qualquer modificador de acesso apenas quando declarada entro de uma classe.
   */
  public enum TypePayment {
    DEBIT(1),
    CREDIT(2);
    public final int VALUE;

    TypePayment(int value) {
      this.VALUE = value;
    }
  }
  private final String name;
  private final TypeClient typeClient;
  private final TypePayment typePayment;

  public Client(String name, TypeClient typeClient, TypePayment typePayment) {
    this.name = name;
    this.typeClient = typeClient;
    this.typePayment = typePayment;
  }

  @Override
  public String toString() {
    return STR."Client{name='\{name}\{'\''}, typeClient=\{typeClient}, typeClientInt=\{typeClient.VALUE}, typePayment=\{typePayment}, typePaymentInt=\{typePayment.VALUE}\{'}'}";
  }
}