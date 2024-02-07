package poo.finalmodified.primitivetype;

public class Car {
  /**
   * Ao declarar uma constante, utiliza-se a palavra-chave "final" após o modificador static,
   *
   * @implNote Sempre ao declarar uma constante, por convenção, utilizar a notação upperCase separando cada palavra por
   * underscore.
   */
  public static final double SPEED_LIMIT;

  //    É possivel inicializar uma constante por meio de um bloco de inicialização estatico pelo fato do bloco de inicialização
//    sempre ser executado, mesmo quando declarado apos a declaração da constante.
  static {
//    Para inicializar uma contante estatica em um bloco de inicialização, é preciso que o bloco tambem seja estatico
    SPEED_LIMIT = 250;
  }

  public final double SPEED_MAX;
  public final double SPEED_IDEAL;

  {
//    Para inicializar uma contante não estatica em um bloco de inicialização, é preciso que o bloco não seja estatico
    SPEED_MAX = 300;
  }

  //  É possivel tambem inicializar constantes por meio de construtores
  public Car(double SPEED_IDEAL) {
    this.SPEED_IDEAL = SPEED_IDEAL;
  }
}
