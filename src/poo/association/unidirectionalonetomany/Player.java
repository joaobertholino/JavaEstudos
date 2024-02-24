package poo.association.unidirectionalonetomany;

/**
 * Na associação unidirecional de um para muitos, apenas a classe A tem relação com a classe B, porem a classe B não tem
 * relação com a classe A.
 *
 * @implNote A classe Team pode ter varios Players, não tendo relação com cada um individualmente, porem, a classe
 * Players pode ter apenas um Team, sendo assim, a classe Players tem relação com a classe Team.
 */
public class Player {
  private String name;

  //  Referenciando a classe Player a classe Team
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

  //  Declarando um setter para a classe Team na classe Player
  public void setTeam(Team team) {
    this.team = team;
  }

  public void print() {
    System.out.println(this.name);

//    Verificando de existe um objeto Team em memória visando evitar NullPointer
    if (team != null) {
      System.out.println(team.getName());
    }
  }
}
