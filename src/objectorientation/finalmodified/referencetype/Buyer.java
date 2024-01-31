package objectorientation.finalmodified.referencetype;

public class Buyer {
  private String name;

  @Override
  public String toString() {
    return STR."Buyer{name='\{name}\{'\''}\{'}'}";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
