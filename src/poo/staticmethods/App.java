package poo.staticmethods;

public class App {
	public static void main(String[] args) {
		Car.setSpeedlimit(250);

		Car c1 = new Car("BMW", 280);
		c1.print();

		Car c2 = new Car("Mercedes", 275);
		c2.print();

		Car c3 = new Car("Audi", 290);
		c3.print();
	}
}
