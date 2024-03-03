package poo.abstractclass.init;

public class App {
	public static void main(String[] args) {
		Maneger myManeger = new Maneger("Ellen", 25500);
		System.out.println(myManeger);

		Developer myDeveloper = new Developer("João", 20000);
		System.out.println(myDeveloper);

		System.out.println(myManeger.abstractExemple());
		System.out.println(myDeveloper.abstractExemple());
	}
}
