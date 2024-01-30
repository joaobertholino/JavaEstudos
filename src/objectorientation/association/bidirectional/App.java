package objectorientation.association.bidirectional;
// TODO: Revisar associação biderecional
// TODO: https://youtu.be/-RtaqvKlH7w?list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW

/**
 * A associação biderecional refere-se a relação de duas classes em que ambas estão cientes uma da outra e podem
 * se referenciar mutuamente, ou seja, se a classe A tem relação com a classe B, a classe B tambem tem relação com a
 * classe A.
 */
public class App {
  public static void main(String[] args) {
    Player playerOne = new Player("Cafu");
    Player playerTwo = new Player("Romario");

    Team teamOne = new Team("Brasil");
    Player[] players = {playerOne, playerTwo};

    playerOne.setTeam(teamOne);
    playerTwo.setTeam(teamOne);
    teamOne.setPlayers(players);

    playerOne.print();
    playerTwo.print();
  }
}
