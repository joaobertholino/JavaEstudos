package objectorientation.interfaces.atributeandmethodstatic;

/**
 * Ordem dos modificares de acesso do mais retristivo ao mais liberal:
 * <p>
 * private => default => package => protected => public
 * <p>
 * Não é permitido a declaração de um modificador mais retristivo que o padrão(public)
 */
public interface DataLoader {
  //  Todos os atributos em uma interface são constantes
  int MAX_DATA_SIZE = 10;

  static String retrieveMaxDataSize() {
    return "Dentro do método estatico retrieveMaxDataSize pertencente a interface DataLoader!";
  }

  String load();

  default String checkPermission() {
    return "Implementação de método default dentro da interface que será sobreescrito na classe!";
  }

  default String vaidation() {
    return "Implementação de método default dentro da interface!";
  }
}
