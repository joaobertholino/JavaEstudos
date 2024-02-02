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

  /**
   * Declarando um método chamado searchForNameReport passando como parametro uma String nameReport, dentro do método
   * é declarado um forEach que ira iterar sobre cada elemento do array retornado por values(), por fim, utilizando um
   * if, será verificado se o values.getNameReport() corresponde ao nameReport passado como argumento para o método,
   * se sim, retorna value, se não, retorna null.
   */
  public static TypeClient searchForNameReport(String nameReport) {
    for (TypeClient value : values()) {
      if (value.getNameReport().equals(nameReport)) {
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
