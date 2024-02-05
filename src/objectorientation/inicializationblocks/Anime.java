package objectorientation.inicializationblocks;

/**
 * Um bloco de inicialização é um bloco de codigo que sera executado a cada instancia da classe
 * e antes da execução dos contrutores
 */
public class Anime {
  private final int[] episodes;
  private String name;

  {
    System.out.println("Dentro do bloco de inicialização!");
    episodes = new int[5];

    for (int i = 0; i < episodes.length; i++) {
      episodes[i] = i + 1;
    }
  }

  public Anime(String name) {
    this.name = name;
  }

  /**
   * A inicialização das propriedades do objeto acontece antes da execução do construtor
   */
  public Anime() {
    System.out.println("Dentro do bloco do construtor sem parametros!");
  }

  public String getName() {
    return name;
  }

  public int[] getEpisodes() {
    return episodes;
  }
}
