package poo.interfaces.atributeandmethodstatic;

public class App {
	public static void main(String[] args) {
		DataBaseLoader databaseLoader = new DataBaseLoader();
		System.out.println(databaseLoader.load());
		System.out.println(databaseLoader.remove());
		System.out.println(databaseLoader.validation());
		System.out.println(databaseLoader.checkPermission());

//    Chamando o método estático pertencente a classe DataBaseLoader.
		System.out.println(DataBaseLoader.retrieveMaxDataSize());

//    Chamando o método estático pertencente a interface DataLoader.
		System.out.println(DataLoader.retrieveMaxDataSize());
	}
}
