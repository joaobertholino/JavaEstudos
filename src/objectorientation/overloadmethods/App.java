package objectorientation.overloadmethods;

public class App {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.init("Mercedes", "AMG G63", "Black", 2024);
        myCar.setReserved(true);
        myCar.print();
    }
}
