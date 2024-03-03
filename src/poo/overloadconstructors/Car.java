package poo.overloadconstructors;

public class Car {
	private String brand;
	private String model;
	private String color;
	private int year;
	private boolean isReserved;

	//  Construtores nunca possui um retorno, nem mesmo retorno void
	public Car(String brand, String model, String color, int year) {
//    this(); => Chama outro construtor, sendo obrigatorio a chamada na primeira linha do bloco de um construtor
		this();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.year = year;
	}

	public Car(String brand, String model, String color, int year, boolean isReserved) {
//    this(brand, model, color, year); => Chamando um construtor especifico com base nos parametros passados
		this(brand, model, color, year);
		this.isReserved = isReserved;
	}

	public Car() {
		System.out.println("Dentro do construtor sem parametros!");
	}

	public void print() {
		System.out.println(STR."Marca: \{this.brand}");
		System.out.println(STR."Modelo: \{this.model}");
		System.out.println(STR."Cor: \{this.color}");
		System.out.println(STR."Ano: \{this.year}");
		System.out.println(STR."Reserva: \{this.isReserved}");
	}
}
