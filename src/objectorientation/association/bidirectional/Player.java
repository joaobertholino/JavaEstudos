package objectorientation.association.bidirectional;

public class Player {
  private String name;
  private Team team;

  public Player(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Team getTeam() {
    return team;
  }

  public void setTeam(Team team) {
    this.team = team;
  }

  public void print() {
    System.out.println(STR."Nome do jogador: \{this.name}");
    if (team != null) {
      System.out.println(STR."Nome do time: \{team.getName()}");
    }
  }
}
