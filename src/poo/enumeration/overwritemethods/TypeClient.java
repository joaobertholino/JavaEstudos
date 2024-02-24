package poo.enumeration.overwritemethods;

public enum TypeClient {
  PESSOA_FISICA(1, "Pessoa Fisica") {
    @Override
    public double calculateDiscount(double value) {
      return value * 0.05;
    }
  },
  PESSOA_JURIDICA(2, "Pessoa Juridica") {
    @Override
    public double calculateDiscount(double value) {
      return value * 0.1;
    }
  };

  public final int VALUE;
  public final String nameReport;

  TypeClient(int value, String nameReport) {
    this.VALUE = value;
    this.nameReport = nameReport;
  }

  /**
   * Em Java, um método abstrato em uma classe abstrata não pode ser declarado como estático. Isso ocorre porque métodos
   * abstratos são implementados pelas classes filhas e não são herdados como métodos estáticos. Métodos estáticos
   * pertencem à classe em si e não podem ser sobrescritos por subclasses. Portanto, a combinação de métodos abstratos e
   * métodos estáticos não é permitida no Java.
   */
  public abstract double calculateDiscount(double value);
}
