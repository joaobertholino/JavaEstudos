package objectorientation.heritage;

public class App {
  public static void main(String[] args) {
    Address address = new Address();
    address.setStreet("Rua 3");
    address.setZipCode("03685-458");

    Person person = new Person("João");
    person.setCpf("568.236.896-23");
    person.setAddress(address);
    person.print();

    System.out.println("----------------------------------------------------");

    Employee employeeOne = new Employee("Ellen");
    employeeOne.setCpf("325.325.896-56");
    employeeOne.setAddress(address);
    employeeOne.setWage(20000);
    employeeOne.print();

    System.out.println("----------------------------------------------------");

    Employee employeeTwo = new Employee("Nicolas", "236.568.526-23", address, 15000);
    employeeTwo.print();
  }
}
