package poo.abstractclass.init;

public class Developer extends Employee {
  public Developer(String name, double wage) {
    super(name, wage);
  }

  @Override
  public String toString() {
    return STR."Developer{name='\{name}\{'\''}, wage=\{wage}\{'}'}";
  }

  /**
   * Implementando a sobreescrita do método abstrato da classe Employee a qual a classe Developer extente.
   */
  @Override
  public String abstractExemple() {
    return "Implementação do método abstrato da classe pai Employee na classe filha Developer.";
  }
}
