package poo.abstractclass.init;

public class Maneger extends Employee {
  public Maneger(String name, double wage) {
    super(name, wage);
  }

  @Override
  public String toString() {
    return STR."Maneger{name='\{name}\{'\''}, wage=\{wage}\{'}'}";
  }

  @Override
  public String abstractExemple() {
    return "Implementação do método abstrato da classe pai Employee na classe filha Maneger.";
  }
}
