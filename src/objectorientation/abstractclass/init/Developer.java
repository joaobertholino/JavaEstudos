package objectorientation.abstractclass.init;

public class Developer extends Employee{
  public Developer(String name, double wage) {
    super(name, wage);
  }

  @Override
  public String toString() {
    return STR."Developer{name='\{name}\{'\''}, wage=\{wage}\{'}'}";
  }

  @Override
  public String abstractExemple() {
    return "Método abstrato de exemplo da classe Developer";
  }
}
