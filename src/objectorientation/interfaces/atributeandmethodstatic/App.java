package objectorientation.interfaces.atributeandmethodstatic;

// TODO: Continuar => https://youtu.be/QKjFkaagGdk?list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW
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
