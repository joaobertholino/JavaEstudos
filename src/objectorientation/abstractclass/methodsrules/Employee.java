package objectorientation.abstractclass.methodsrules;

/**
 * Extendendo a classe abstrata Person na classe, tambem abstrata, Employee.
 * @implNote Classes abstratas que extenden outra classe abstrata, não necessitam sobreescrever seus métodos, caso seja
 * feita a implementação concreta do método, as subClasses concretas herdaram esse método.
 */
public abstract class Employee extends Person {
  protected String name;
  protected double wage;

  public Employee(String name, double wage) {
    this.name = name;
    this.wage = wage;
  }

  public abstract String calculateBonus();
}
