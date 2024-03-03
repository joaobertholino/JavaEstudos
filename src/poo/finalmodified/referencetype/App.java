package poo.finalmodified.referencetype;

// Estudar o Singleton Pattern
public class App {
	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.println(myCar.BUYER);

//    Podemos alterar as propriedades do objeto a qual a constante faz referencia, apenas não sendo possivel alterar
//    a referencia dessa constante.
		myCar.BUYER.setName("João");
		System.out.println(myCar.BUYER);
	}
}
