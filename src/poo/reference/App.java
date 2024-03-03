package poo.reference;

public class App {
	public static void main(String[] args) {
//    Instanciando primeiro objeto
		Car ferrari = new Car();
		ferrari.brand = "Ferrari";
		System.out.println(ferrari.brand);

		ferrari.color = "Red";
		System.out.println(ferrari.color);

		ferrari.model = "pureBlood";
		System.out.println(ferrari.model);

		ferrari.year = 2024;
		System.out.println(ferrari.year);

//    Instanciando segundo objeto
		Car mercedes = new Car();
		mercedes.brand = "Mercedes";
		System.out.println(mercedes.brand);

		mercedes.color = "black";
		System.out.println(mercedes.color);

		mercedes.model = "AMG G63";
		System.out.println(mercedes.model);

		mercedes.year = 2022;
		System.out.println(mercedes.year);

//    Declarando que o objeto ferrari faz referencia para o objeto mercedes
		ferrari = mercedes;
		System.out.println(STR."Ferrari: \{ferrari.brand}");
		System.out.println(STR."Ferrari: \{ferrari.color}");
		System.out.println(STR."Ferrari: \{ferrari.model}");
		System.out.println(STR."Ferrari: \{ferrari.year}");

		System.out.println(STR."Mercedes: \{mercedes.brand}");
		System.out.println(STR."Mercedes: \{mercedes.color}");
		System.out.println(STR."Mercedes: \{mercedes.model}");
		System.out.println(STR."Mercedes: \{mercedes.year}");
	}
}
