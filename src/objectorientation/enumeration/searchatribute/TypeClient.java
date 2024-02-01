package objectorientation.enumeration.searchatribute;

public enum TypeClient {
  PESSOA_FISICA(1, "Pessoa Fisica"),
  PESSOA_JURIDICA(2, "Pessoa Juridica");
  private final int value;
  private final String NameReport;

  TypeClient(int value, String nameReport) {
    this.value = value;
    this.NameReport = nameReport;
  }

  public static TypeClient searchForNameReport(String nameReport){
    for (TypeClient value : values()) {
      if (value.getNameReport().equals(nameReport)){
        return value;
      }
    }
    return null;
  }

  public int getValue() {
    return value;
  }

  public String getNameReport() {
    return NameReport;
  }
}
