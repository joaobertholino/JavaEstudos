package poo.heritage.inicializationsequence;

import poo.heritage.init.Address;
import poo.heritage.init.Employee;

public class App {
  public static void main(String[] args) {
    Address addressOne = new Address();
    addressOne.setStreet("Rua 3");
    addressOne.setZipCode("03685-458");

//    Step 1 => A classe pai(superClass) é executada primeiro junto ao seu bloco estatico.
//    Step 2 => A classe filha(subClass) é executada junto a seu bloco estatico.
//    Step 3 => A classe pai(superClass) executa seus blocos não estaticos.
//    Step 4 => A classe filha(subClass) executa seus blocos não estaticos.
    Employee employeeOne = new Employee("João", "212.458.365-56", addressOne, 20000);

    System.out.println("-------------------------------------------------------------------");

//    Step 5 => Na segunda instancia os blocos estaticos tanto da classe pai(superClass) quanto da filha(subClass) não são executados.
//    Step 6 => A classe pai(superClass) executa seus blocos não estaticos.
//    Step 7 => A classe filha(subClass) executa seus blocos não estaticos.
    Employee employeeTwo = new Employee("Ellen", "125.698.568-85", addressOne, 30000);
  }
}
