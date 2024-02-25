package poo.heritage.init;

public class Person {
  static {
    System.out.println("Dentro do bloco de inicialização estatico de Person!");
  }

  /**
   * protected => Ao definir um membro como protected, todas as subclasses que estentem a classe que possui membros
   * declarados como protected, herdam os membros como se fossem deles proprios.
   */
  protected String name;
  protected String cpf;
  protected Address address;

  {
    System.out.println("Dentro do bloco de inicialização não estatico 1 de Person!");
  }

  {
    System.out.println("Dentro do bloco de inicialização não estatico 2 de Person!");
  }

  //  Ao definir um construtor na classe pai, o mesmo devera ser declarado na classe filha
  public Person(String name, String cpf, Address address) {
    this.name = name;
    this.cpf = cpf;
    this.address = address;
  }

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
