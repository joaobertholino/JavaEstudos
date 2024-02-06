package objectorientation.interfaces.init;

public class DatabaseLoader implements DataLoader {
  /**
   * Implementando a sobreescrita de método herdado da interface {@code DataLoader} na classe {@code DatabaseLoader}.
   */
  @Override
  public String loadOne() {
    return "Implementação do método da interface DataLoader na classe DatabaseLoader.";
  }
}
