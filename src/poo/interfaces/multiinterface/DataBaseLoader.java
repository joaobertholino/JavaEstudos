package poo.interfaces.multiinterface;

public class DataBaseLoader implements DataLoader, DataRemover {
  @Override
  public String load() {
    return "Executando método load da interface DataLoader implementado na classe DataBaseLoader!";
  }

  @Override
  public String remove() {
    return "Executando método remove da interface DataRemove implementado na classe DataBaseLoader!";
  }

  @Override
  public String checkPermission() {
    return "Executando método checkPermission da interface DataLoader implementado na classe DataBaseLoader!";
  }
}
