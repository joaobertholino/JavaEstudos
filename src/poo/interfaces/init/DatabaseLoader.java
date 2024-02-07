package poo.interfaces.init;

public class DatabaseLoader implements DataLoader {
  /**
   * Implementando a sobreescrita de método herdado da interface {@code DataLoader} na classe {@code DataBaseLoader}.
   */
  @Override
  public String loadOne() {
    return "Implementação do método da interface DataLoader na classe DataBaseLoader.";
  }
}
