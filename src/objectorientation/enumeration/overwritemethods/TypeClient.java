package objectorientation.enumeration.overwritemethods;

public enum TypeClient {
  PESSOA_FISICA(1, "Pessoa Fisica"),
  PESSOA_JURIDICA(2, "Pessoa Juridica");
  public final int VALUE;
  public final String nameReport;

  TypeClient(int value, String nameReport) {
    this.VALUE = value;
    this.nameReport = nameReport;
  }
}
