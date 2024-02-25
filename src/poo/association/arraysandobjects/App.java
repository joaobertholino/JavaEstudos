package poo.association.arraysandobjects;

public class App {
  public static void main(String[] args) {
//    Instanciando tres objetos
    Player playerOne = new Player("Pelé");
    Player playerTwo = new Player("Romário");
    Player playerThree = new Player("Cafu");

//    Armazenando os tres objetos em um array, nesse momento, os objetos passam a ter duas formas de ser acessados:
//    Acesso direto sem passar pelo array
//    Acesso pelo seu índice correspondente no array
    Player[] players = new Player[]{playerOne, playerTwo, playerThree};

//    Iterando pelos indices do array
    for (Player player : players) {
      player.print();
    }
  }
}
