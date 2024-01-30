package objectorientation.heritage.heritageinit;

// TODO: Revisar herança
public class App {
  public static void main(String[] args) {
    Address address = new Address();
    address.setStreet("Rua 3");
    address.setZipCode("03685-458");

    Person person = new Person();
    person.setName("João");
    person.setCpf("568.236.896-23");
    person.setAddress(address);
    person.print();

    Employee employee = new Employee();
    employee.setName("Ellen");
    employee.setCpf("325.325.896-56");
    employee.setAddress(address);
    employee.setWage(23564);
    employee.print();
  }
}
