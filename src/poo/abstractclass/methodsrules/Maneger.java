package poo.abstractclass.methodsrules;

public class Maneger extends Employee {
  public Maneger(String name, double wage) {
    super(name, wage);
  }

  @Override
  public String toString() {
    return STR."Maneger{name='\{name}\{'\''}, wage=\{wage}\{'}'}";
  }

  @Override
  public String calculateBonus() {
    this.wage = this.wage + this.wage * 0.05;
    return STR."Salario do gerente com bonus aplicado: \{this.wage}";
  }

  @Override
  public void print() {
    System.out.println("Implementando um método herdado da classe Person a qual a classe Employee extende.");
  }
}
