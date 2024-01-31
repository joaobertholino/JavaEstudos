package objectorientation.finalmodified.primitivetype;

// TODO: Revisar modificador final
public class App {
  public static void main(String[] args) {
    Car myCar = new Car();

//    É preferivel chamar constantes pela classe, e não pela variavel de referencia
    double speedLimit = Car.SPEED_LIMIT;
    System.out.println(speedLimit);
  }
}
