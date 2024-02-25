package poo.association.unidirectionalonetomany;

// TODO: Revisar associação uniderecional de um-para-muitos
public class App {
  public static void main(String[] args) {
    Player playerOne = new Player("Pelé");
    Team teamOne = new Team("Seleção Brasileira");

    playerOne.setTeam(teamOne);
    playerOne.print();
  }
}
