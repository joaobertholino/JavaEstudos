package objectorientation.constructors;

public class App {
    public static void main(String[] args) {
/*
        Ao instanciar um novo objeto de uma classe com construtor declarado, é necessario passar os valores das
        propriedades como argumento
*/
        Car myCarOne = new Car("Mercedes", "AMG G63", "Black", 2024);
        myCarOne.print();

//        Instanciando um objeto sem os valores das propriedades definidas
        Car myCarTwo = new Car();
        myCarTwo.print();

        Car myCarThree = new Car(true);
        myCarTwo.print();
    }
}
