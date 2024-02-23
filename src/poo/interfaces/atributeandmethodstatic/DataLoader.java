package poo.interfaces.atributeandmethodstatic;

/**
 * Não é permitido a declaração de um modificador mais retristivo que o padrão(public).
 * <p>
 * Ordem dos modificares de acesso do mais retristivo ao mais liberal:
 * <p>
 * {@code private} => O acesso é permitido apenas dentro da própria classe.
 * <p>
 * {@code default} => O acesso é permitido apenas dentro do mesmo pacote.
 * <p>
 * {@code protected} => O acesso é permitido apenas para classes no mesmo pacote ou subclasses.
 * <p>
 * {@code public} => O acesso é permitido de qualquer lugar, dentro ou fora do pacote.
 */
public interface DataLoader {

  /**
   * Declarando uma constante do tipo inteiro {@code MAX_DATA_SIZE}, sendo inicializada com o valor de {@value MAX_DATA_SIZE},
   * na interface {@code DataLoader}.
   * <p>
   * Por padrão, todos os atributos de uma interface são publicos ({@code public}), estaticos ({@code static}) e constantes ({@code final}).
   */
  int MAX_DATA_SIZE = 10;

  /**
   * Declarando método estatico {@code retrieveMaxDataSize} na interface {@code DataLoader}.
   */
  static String retrieveMaxDataSize() {
    return "Declaração do método estatico retrieveMaxDataSize da interface DataLoader.";
  }

  /**
   * Declarando método {@code load} a ser implementado na classe {@code DataBaseLoader}.
   * <p>
   * Por padrão, todos os métodos de uma interface são publicos ({@code public}) e abstratos ({@code abstract}).
   */
  String load();

  /**
   * Declarando métodos default {@code checkPermission} e {@code validation} na interface {@code DataLoader}.
   */
  default String checkPermission() {
    return "Declaranção do método default dentro da interface DataLoader que será sobreescrito na classe DataBaseLoader!";
  }

  default String validation() {
    return "Declarando do método default dentro da interface DataLoader!";
  }
}
