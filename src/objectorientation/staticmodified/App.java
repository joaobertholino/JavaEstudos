package objectorientation.staticmodified;

public class App {
  public static void main(String[] args) {
//        Ao reatribuir uma propriedade estatica, ela sera aplicada a todos os objetos
//        Alterando um propriedade estatica da classe Car, sem necessidade de existir uma instancia da classe
    Car.speedlimit = 250;

    Car c1 = new Car("BMW", 280);
    c1.print();

    Car c2 = new Car("Mercedes", 275);
    c2.print();

    Car c3 = new Car("Audi", 290);
    c3.print();
  }
}
