package poo.finalmodified.classandmethods;

import poo.finalmodified.referencetype.Car;

/**
 * Ao declarar uma classe como final, nenhuma classe podera extender dela, assim protegendo de alterações indesejadas.
 */
public final class Ferrari extends Car {
	private String model;

	/**
	 * Caso a classe seja declarada como {@code final}, se torna desnecessario declarar seus metodos como {@code final}
	 * tambem.
	 */
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
