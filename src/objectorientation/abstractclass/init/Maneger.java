package objectorientation.abstractclass.init;

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
    return "Método abstrato de exemplo da classe Maneger";
  }
}
