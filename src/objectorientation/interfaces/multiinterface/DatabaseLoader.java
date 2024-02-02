package objectorientation.interfaces.multiinterface;

public class DatabaseLoader implements DataLoader, DataRemover {
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
