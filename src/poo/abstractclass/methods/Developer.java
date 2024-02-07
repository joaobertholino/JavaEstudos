package poo.abstractclass.methods;

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
}
