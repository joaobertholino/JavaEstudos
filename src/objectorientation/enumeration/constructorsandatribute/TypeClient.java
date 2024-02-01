package objectorientation.enumeration.constructorsandatribute;

public enum TypeClient {
  PESSOA_FISICA(1),
  PESSOA_JURIDICA(2);
  public final int VALUE;

  TypeClient(int value) {
    this.VALUE = value;
  }
}
