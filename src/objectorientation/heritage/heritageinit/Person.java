package objectorientation.heritage.heritageinit;

public class Person {
  private String name;
  private String cpf;
  private Address address;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public void print() {
    System.out.println(STR."Nome da pessoa: \{this.name}");
    System.out.println(STR."CPF da pessoa: \{this.cpf}");
    System.out.println(STR."Nome da rua: \{this.address.getStreet()} | Codigo postal: \{this.address.getZipCode()}");
  }
}
