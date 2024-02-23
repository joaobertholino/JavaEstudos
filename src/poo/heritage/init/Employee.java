package poo.heritage.init;

/**
 * Ao extender uma classe de outra, todos os membros da classe pai são herdados para a classe filho,
 * resultando em um forte acoplamento do codigo.
 *
 * @implNote Não é possivel efetuar uma herança multipla, pois todas as classes extendem a classe Object do Java.
 */
public class Employee extends Person {
  static {
    System.out.println("Dentro do bloco de inicialização estatico de Employee!");
  }

  private int wage;

  {
    System.out.println("Dentro do bloco de inicialização não estatico 1 de Employee!");
  }

  {
    System.out.println("Dentro do bloco de inicialização não estatico 2 de Employee!");
  }

  //  Chamando um construtor especifico(com base nos parametros passados) da classe pai utilizando super e adicionando
//  mais codigo ao construtor da classe filho
  public Employee(String name, String cpf, Address address, int wage) {
    super(name, cpf, address);
    this.wage = wage;
  }

  public int getWage() {
    return wage;
  }

  public void setWage(int wage) {
    this.wage = wage;
  }

  public void print() {
//    super => Chamando o método da classe pai e apos ser executado, passara a executar o codigo da classe filho
    super.print();
    System.out.println(STR."Salario do funcionario: \{this.wage}");
  }
}