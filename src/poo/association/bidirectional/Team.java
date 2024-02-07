package poo.association.bidirectional;

public class Team {
  private String name;
//  Declarando uma associação da classe Team a um array da classe Player
  private Player[] players;

  public Team(String name) {
    this.name = name;
  }

  public Team(String name, Player[] players) {
    this.name = name;
    this.players = players;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Player[] getPlayers() {
    return players;
  }

  public void setPlayers(Player[] players) {
    this.players = players;
  }

  public void print() {
    System.out.println(this.name);
    if (players == null) return;
    for (Player player : players) {
      System.out.println(player.getName());
    }
  }
}
