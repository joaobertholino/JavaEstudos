package objectorientation.association.arraysandobjects;

public class Player {
  private final String name;

  public Player(String name) {
    this.name = name;
  }

  public void print() {
    System.out.println(STR."Nome do jogador: \{this.name}");
  }
}
