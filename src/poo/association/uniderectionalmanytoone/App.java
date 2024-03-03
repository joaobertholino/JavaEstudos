package poo.association.uniderectionalmanytoone;

// TODO: Estudar sobre associação junto a estruturas de dados

/**
 * Ao instanciar objetos, é preferível instanciar os objetos que não possuem referencias primeiro aos que possuem, assim
 * melhorando a legibilidade e o entendimento do código, evitando erros como {@code NullPointerException} que acontece
 * ao instanciar um objeto que faz referencia a outro objeto que ainda não foi instanciado.
 */
public class App {
	public static void main(String[] args) {
		Teacher teacherOne = new Teacher("Adriano Malagoli");
		Teacher teacherTwo = new Teacher("Lucas Portal");

		Teacher[] teachersList = {teacherOne, teacherTwo};

		School schoolOne = new School("SENAI Paulo Skaf", teachersList);

		schoolOne.print();
	}
}
