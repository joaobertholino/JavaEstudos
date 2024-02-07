package poo.enumeration.constructorsandatribute;

/**
 * Ao chamar um valor de enumeração, automaticamente será chamado seu construtor e atribuido a sua propriedade constante
 * o valor declarado a esse valor.
 */
public enum TypeClient {
  PESSOA_FISICA(1),
  PESSOA_JURIDICA(2);
  public final int VALUE;

  /**
   * O construtor sera chamado quando algum valor de enumeração for declarado, automaticamente passando, como argumento,
   * o valor definido entre parenteses, isso acontece pelo fato do construtor por padrão ser privado.
   */
  TypeClient(int value) {
    this.VALUE = value;
  }
}
