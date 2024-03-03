package poo.interfaces.multiinterface;

public class App {
	public static void main(String[] args) {
		DataBaseLoader databaseLoader = new DataBaseLoader();
		System.out.println(databaseLoader.load());
		System.out.println(databaseLoader.remove());
		System.out.println(databaseLoader.validation());
		System.out.println(databaseLoader.checkPermission());
	}
}
