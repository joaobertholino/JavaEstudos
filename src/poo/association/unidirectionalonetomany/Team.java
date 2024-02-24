package poo.association.unidirectionalonetomany;

/**
 * Como a classe Team não tem relação com a classe Player, não é possivel retornar os jogadores por meio da classe
 * Team.
 */
public class Team {
  private String name;

  public Team(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
