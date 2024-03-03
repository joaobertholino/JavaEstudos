package poo.heritage.inicializationsequence;

import poo.heritage.init.Address;
import poo.heritage.init.Employee;

public class App {
	public static void main(String[] args) {
		Address addressOne = new Address();
		addressOne.setStreet("Rua 3");
		addressOne.setZipCode("03685-458");

//    PRIMEIRA INSTANCIA:
//    Step 1 => A classe pai(superClass) é executada primeiro junto ao seu bloco estático.
//    Step 2 => A classe filha(subClass) é executada junto a seu bloco estático.
//    Step 3 => A classe pai(superClass) executa seus blocos não estáticos.
//    Step 4 => A classe filha(subClass) executa seus blocos não estáticos.
		Employee employeeOne = new Employee("João", "212.458.365-56", addressOne, 20000);

		System.out.println("-------------------------------------------------------------------");

//    SEGUNDA INSTANCIA:
//    Step 5 => Na segunda instancia os blocos estáticos tanto da classe pai(superClass) quanto da filha(subClass) não são executados.
//    Step 6 => A classe pai(superClass) executa seus blocos não estáticos.
//    Step 7 => A classe filha(subClass) executa seus blocos não estáticos.
		Employee employeeTwo = new Employee("Ellen", "125.698.568-85", addressOne, 30000);
	}
}
