package poo.finalmodified.classandmethods;

import poo.finalmodified.referencetype.Car;

/**
 * Ao declarar uma classe como final, ela não podera ser extendida, assim, protegendo contra alterações inesperadas.
 */
public final class Ferrari extends Car {
  private String model;

  //  Caso a classe esteja como final, se torna desnecessario declarar seus métodos como final
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }
}
