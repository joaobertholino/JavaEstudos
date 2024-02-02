package objectorientation.interfaces.atributeandmethodstatic;

public class DatabaseLoader implements DataLoader, DataRemover {
  /**
   * Ao implementar um método estatico de uma interface em uma classe, ele não sera sobreescrito, podendo, com o mesmo
   * nome, ser acessado tanto pela implementação da classe quanto pela implementação da interface
   */
  static String retrieveMaxDataSize() {
    return "Dentro do método estatico retrieveMaxDataSize pertencente a classe DatabaseLoader!";
  }

  @Override
  public String load() {
    return "Executando método da interface implementado na classe Databaseloader!";
  }

  @Override
  public String remove() {
    return "Executando método de outra interface!";
  }

  @Override
  public String checkPermission() {
    return "Implementando a sobreescrita do método default da interface!";
  }
}
