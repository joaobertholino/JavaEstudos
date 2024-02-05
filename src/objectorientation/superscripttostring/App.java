package objectorientation.superscripttostring;

public class App {
  /**
   * Não é necessario declarar o {@code toString} ao chamar uma variavel de referencia, isso é feito de forma inplicita.
   */
  public static void main(String[] args) {
    Anime animeOne = new Anime("Dr. Stone");
    System.out.println(animeOne);
  }
}