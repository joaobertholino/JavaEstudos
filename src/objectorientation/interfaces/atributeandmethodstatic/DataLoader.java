package objectorientation.interfaces.atributeandmethodstatic;

/**
 * Ordem dos modificares de acesso do mais retristivo ao mais liberal:
 * Não é permitido a declaração de um modificador mais retristivo que o padrão(public).
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
  int MAX_DATA_SIZE = 10;

  static String retrieveMaxDataSize() {
    return "Declaração do método estatico retrieveMaxDataSize da interface DataLoader.";
  }

  String load();

  default String checkPermission() {
    return "Implementação de método default dentro da interface que será sobreescrito na classe!";
  }

  default String vaidation() {
    return "Implementação de método default dentro da interface!";
  }
}
