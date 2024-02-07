package poo.finalmodified.primitivetype;

public class App {
  public static void main(String[] args) {
    Car myCar = new Car(150);
    System.out.println(myCar.SPEED_IDEAL);

//    Quando a constante é estatica, sempre sera acessada pelo nome da classe
    double speedLimit = Car.SPEED_LIMIT;
    System.out.println(speedLimit);

//    Quando a contante não é estatica, sempre sera acessada pela variavel de referencia
    double speedMax = myCar.SPEED_MAX;
    System.out.println(speedMax);
  }
}
