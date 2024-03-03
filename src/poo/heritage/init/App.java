package poo.heritage.init;

public class App {
	public static void main(String[] args) {
		Address address = new Address();
		address.setStreet("Rua 3");
		address.setZipCode("03685-458");

		Person person = new Person("João", "568.236.896-23", address);
		person.print();

		System.out.println("----------------------------------------------------");

		Employee employeeOne = new Employee("Ellen", "325.325.896-56", address, 20000);
		employeeOne.print();

		System.out.println("----------------------------------------------------");

		Employee employeeTwo = new Employee("Nicolas", "236.568.526-23", address, 15000);
		employeeTwo.print();

		System.out.println("----------------------------------------------------");
	}
}
