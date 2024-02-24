package poo.interfaces.atributeandmethodstatic;

public class DataBaseLoader implements DataLoader, DataRemover {
  /**
   * Implementando o método estatico {@code retrieveMaxDataSize} da interface {@code DataLoader} na classe
   * {@code DataBaseLoader}.
   * <p>
   * Ao implementar um método estatico de uma interface em uma classe, ele não sera sobreescrito, podendo, com o mesmo
   * nome, ser acessado tanto pela implementação da classe quanto pela implementação da interface.
   */
  static String retrieveMaxDataSize() {
    return "Declaração do método estatico retrieveMaxDataSize da classe retrieveMaxDataSize.";
  }

  /**
   * Implementando a sobrescrita do método {@code load} da interface {@code DataLoader} na classe
   * {@code DataBaseLoader}.
   */
  @Override
  public String load() {
    return "Executando método da interface DataLoader, implementado na classe Databaseloader!";
  }

  /**
   * Implementando a sobreescrita do método {@code remove} da interface {@code DataRemover} na classe
   * {@code DataBaseLoader}.
   */
  @Override
  public String remove() {
    return "Implementando a sobreescrita do método remove da interface DataRemove na classe DataBaseLoader!";
  }

  /**
   * Implementando a sobreescrita do método default {@code checkPermission} da interface {@code DataLoader} na classe
   * {@code DataBaseLoader}.
   */
  @Override
  public String checkPermission() {
    return "Implementando a sobreescrita do método default da interface DataLoader!";
  }
}
