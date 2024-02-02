package objectorientation.interfaces.multiinterface;

public class App {
  public static void main(String[] args) {
    DatabaseLoader databaseLoader = new DatabaseLoader();
    System.out.println(databaseLoader.load());
    System.out.println(databaseLoader.remove());
    System.out.println(databaseLoader.vaidation());
    System.out.println(databaseLoader.checkPermission());
  }
}
