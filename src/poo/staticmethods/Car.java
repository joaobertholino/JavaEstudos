package poo.staticmethods;

public class Car {
	private static double speedlimit = 250;
	private String brand;
	private double maximumSpeed;

	public Car(String brand, double maximumSpeed) {
		this.brand = brand;
		this.maximumSpeed = maximumSpeed;
	}

	public static double getSpeedlimit() {
		return speedlimit;
	}

	/**
	 * Ao inves de utilizar {@code this} para manipular uma propriedade estatica, usa-se o nome da classe.
	 * <p>
	 * O this se refere ao objeto, e metodos e props estaticas se referen a classe.
	 * <p>
	 * Métodos estaticos não tem acesso a propriedades que não sejam estaticas.
	 */
	public static void setSpeedlimit(double speedlimit) {
		Car.speedlimit = speedlimit;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getMaximumSpeed() {
		return this.maximumSpeed;
	}

	public void setMaximumSpeed(double maximumSpeed) {
		this.maximumSpeed = maximumSpeed;
	}

	/**
	 * Os métodos não estáticos em Java podem acessar propriedades estáticas da classe diretamente. No entanto, é
	 * importante entender que as propriedades estáticas pertencem à classe em si, não a uma instância específica da
	 * classe. Portanto, elas podem ser acessadas de qualquer lugar dentro da classe, independentemente do método ser
	 * estático ou não.
	 */
	public void print() {
		System.out.println("-------------------------------------");
		System.out.println(STR."Marca: \{this.brand}");
		System.out.println(STR."Velocidade Maxima: \{this.maximumSpeed}");
		System.out.println(STR."Velocidade Limite: \{Car.speedlimit}");
	}
}
