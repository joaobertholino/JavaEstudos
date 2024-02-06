package objectorientation.abstractclass.methods;

public class Maneger extends Employee {
  public Maneger(String name, double wage) {
    super(name, wage);
  }

  @Override
  public String toString() {
    return STR."Maneger{name='\{name}\{'\''}, wage=\{wage}\{'}'}";
  }

  /**
   * Implementando um método abstrato da superClasse, utilizando a notação {@code @Override} para
   * garantir a sobreescrita do método.
   */
  @Override
  public String calculateBonus() {
    this.wage = this.wage + this.wage * 0.05;
    return STR."Salario do gerente com bonus aplicado: \{this.wage}";
  }
}
