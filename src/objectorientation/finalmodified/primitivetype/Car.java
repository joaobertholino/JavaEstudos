package objectorientation.finalmodified.primitivetype;

public class Car {
  /**
   * Ao declarar uma constante, utiliza-se a palavra-chave "final" após o modificador static
   */
  public static final double SPEED_LIMIT;

  static {
//    É possivel inicializar uma constante por meio de um bloco de inicialização estatico
    SPEED_LIMIT = 250;
  }
}
