package objectorientation.interfaces.init;

public class App {
  public static void main(String[] args) {
    DatabaseLoader databaseLoader = new DatabaseLoader();
    System.out.println(databaseLoader.load());
  }
}
