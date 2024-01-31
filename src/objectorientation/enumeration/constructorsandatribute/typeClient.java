package objectorientation.enumeration.constructorsandatribute;

public enum typeClient {
  PESSOA_FISICA(1),
  PESSOA_JURIDICA(2);
  public final int VALUE;

  typeClient(int value) {
    this.VALUE = value;
  }
}
