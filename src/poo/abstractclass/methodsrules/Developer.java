package poo.abstractclass.methodsrules;

public class Developer extends Employee {
  public Developer(String name, double wage) {
    super(name, wage);
  }

  @Override
  public String toString() {
    return STR."Developer{name='\{name}\{'\''}, wage=\{wage}\{'}'}";
  }

  /**
   * Implementando a sobreescrita do método abstrato da classe abstrata {@code Employee} na classe concreta {@code Developer}.
   */
  @Override
  public String calculateBonus() {
    this.wage = this.wage + this.wage * 0.1;
    return STR."Salario do desenvolvedor com bonus aplicado: \{this.wage}";
  }

  /**
   * Implementando a sobreescrita do método abstrato da classe abstrata
   * {@code Person} na classe concreta {@code Developer}.
   */
  @Override
  public void print() {
    System.out.println("Implementando um método herdado da classe Person a qual a classe Employee extende.");
  }
}
