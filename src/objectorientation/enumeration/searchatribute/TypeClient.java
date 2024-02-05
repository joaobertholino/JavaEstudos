package objectorientation.enumeration.searchatribute;

// TODO: Continuar => https://youtu.be/rbqIXJwy6-M?list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW
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
   * Declarando um método chamado {@code searchForNameReport} passando como parametro uma {@code String nameReport},
   * dentro do método é declarado um forEach que ira iterar sobre cada elemento do array retornado por {@code values()},
   * por fim, utilizando um {@code if}, será verificado se o {@code values.getNameReport()} corresponde ao {@code nameReport}
   * passado como argumento para o método, se sim, retorna {@code value}, se não, retorna {@code null}.
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
