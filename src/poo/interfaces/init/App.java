package poo.interfaces.init;

public class App {
	public static void main(String[] args) {
		DatabaseLoader databaseLoader = new DatabaseLoader();

//    Executando método da interface DataLoader implementado na classe DataBaseLoader
		System.out.println(databaseLoader.loadOne());

//    Executando método estático da interface DataLoader
		System.out.println(DataLoader.loadTwo());

		System.out.println(databaseLoader.VARIABLE_INTERFACE);
	}
}
