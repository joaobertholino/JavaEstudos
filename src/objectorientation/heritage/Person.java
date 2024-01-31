package objectorientation.heritage;

public class Person {
  /**
   * protected => Ao definir um membro como protected, todos as subclasses e classes do mesmo pacote, teram acesso a esse
   * membro como se pertencessem a eles proprios.
   */
  protected String name;
  protected String cpf;
  protected Address address;
  static {
    System.out.println("Dentro do bloco de inicialização estatico de Person!");
  }
  {
    System.out.println("Dentro do bloco de inicialização não estatico 1 de Person!");
  }
  {
    System.out.println("Dentro do bloco de inicialização não estatico 2 de Person!");
  }

  public Person(String name) {
    System.out.println("Dentro do construtor de Person!");
    this.name = name;
  }

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
