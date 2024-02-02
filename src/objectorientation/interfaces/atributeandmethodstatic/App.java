package objectorientation.interfaces.atributeandmethodstatic;

public class App {
  public static void main(String[] args) {
    DatabaseLoader databaseLoader = new DatabaseLoader();
    System.out.println(databaseLoader.load());
    System.out.println(databaseLoader.remove());
    System.out.println(databaseLoader.vaidation());
    System.out.println(databaseLoader.checkPermission());

//    Chamando o método pertencente a classe DatabaseLoader
    System.out.println(DatabaseLoader.retrieveMaxDataSize());

//    Chamando o método pertencente a interface DataLoader
    System.out.println(DataLoader.retrieveMaxDataSize());
  }
}
