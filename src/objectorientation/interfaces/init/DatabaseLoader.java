package objectorientation.interfaces.init;

public class DatabaseLoader implements DataLoader {
  //  Implementando método da interface
  @Override
  public String load() {
    return "Executando método da interface implementado na classe Databaseloader!";
  }
}
