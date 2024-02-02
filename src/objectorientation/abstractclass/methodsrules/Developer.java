package objectorientation.abstractclass.methodsrules;

public class Developer extends Employee {
  public Developer(String name, double wage) {
    super(name, wage);
  }

  @Override
  public String toString() {
    return STR."Developer{name='\{name}\{'\''}, wage=\{wage}\{'}'}";
  }

  @Override
  public String calculateBonus() {
    this.wage = this.wage + this.wage * 0.1;
    return STR."Salario do desenvolvedor com bonus aplicado: \{this.wage}";
  }

  @Override
  public void print() {
    System.out.println("Implementando um método herdado da classe Person a qual a classe Employee extende");
  }
}