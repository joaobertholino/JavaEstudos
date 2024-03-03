package poo.abstractclass.methodsrules;

public class App {
	public static void main(String[] args) {
		Maneger myManeger = new Maneger("Ellen", 25500);
		System.out.println(myManeger);

		Developer myDeveloper = new Developer("João", 20000);
		System.out.println(myDeveloper);

		String bonusMyManeger = myManeger.calculateBonus();
		System.out.println(bonusMyManeger);

		String bonusMyDeveloper = myDeveloper.calculateBonus();
		System.out.println(bonusMyDeveloper);

		myManeger.print();
		myDeveloper.print();
	}
}
