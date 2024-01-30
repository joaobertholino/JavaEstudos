package objectorientation.constructors;

public class App {
  public static void main(String[] args) {
//        Instanciando um objeto passando como argumento os valores do construtor
    Car myCarOne = new Car("BMW", "X1", "White", 2024);
    myCarOne.print();

//        Inicializando um objeto sem argumentos utilizando o segundo construtor
    Car myCarTwo = new Car();
    myCarTwo.print();
  }
}
