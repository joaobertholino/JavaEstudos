package poo.finalmodified.referencetype;

public class Car {
  public static final double SPEED_LIMIT;

  static {
    SPEED_LIMIT = 250;
  }

  public final double SPEED_MAX;
  //  Declarando uma contante que faz referencia, da qual nunca vai poder ser alterada, a um novo objeto
  public final Buyer BUYER = new Buyer();

  {
    SPEED_MAX = 300;
  }

  //  Métodos declarados como final, nunca poderam ser sobreescritos em uma classe filha
  public final void print() {
    System.out.println(this.SPEED_MAX);
  }
}
