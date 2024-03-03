package poo.staticmodified;

public class App {
	public static void main(String[] args) {
		Car c1 = new Car("BMW", 280);
		c1.print();

		Car c2 = new Car("Mercedes", 275);
		c2.print();

//    Alterando um propriedade estatica da classe Car, sem necessidade de existir uma instancia da classe
//    Ao reatribuir uma propriedade estatica, ela sera aplicada a todos os objetos
		Car.speedlimit = 350;

		Car c3 = new Car("Audi", 290);
		c3.print();
	}
}
