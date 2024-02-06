package objectorientation.interfaces.init;

public class App {
  public static void main(String[] args) {
    DatabaseLoader databaseLoader = new DatabaseLoader();

    System.out.println(databaseLoader.loadOne());

    System.out.println(DataLoader.loadTwo());

    System.out.println(databaseLoader.VARIABLE_INTERFACE);
  }
}
