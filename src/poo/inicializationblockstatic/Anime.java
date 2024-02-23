package poo.inicializationblockstatic;

/**
 * Métodos estaticos são executados apenas uma vez, quando a classe é carregada pela JVM
 */
public class Anime {
  private static final int[] episodes;

  static {
    System.out.println("Dentro do primeiro bloco estatico de inicialização!");
    episodes = new int[3];

    for (int i = 0; i < episodes.length; i++) {
      episodes[i] = i + 1;
      System.out.println(STR."\{episodes[i]} ");
    }
  }

  //  Um segundo bloco de inicialização sera executado após o seu anterior e assim por diante
  static {
    System.out.println("Dentro do segundo bloco estatico de inicialização!");

    for (int i = 0; i < episodes.length; i++) {
      episodes[i] = i + 1;
      System.out.println(STR."\{episodes[i]} ");
    }
  }

  private String name;

  //  Junto aos blocos estaticos, podem existir blocos não estaticos que seram executados após os blocos estaticos
  {
    System.out.println("Dentro do terceiro bloco não estatico de inicialização!");

    for (int i = 0; i < episodes.length; i++) {
      episodes[i] = i + 1;
      System.out.println(STR."\{episodes[i]} ");
    }
  }

  public Anime() {
  }
}
