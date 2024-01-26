package objectorientation.constructors;

// TODO: Revisar sobrecarga de construtores
public class Car {
    private String brand;
    private String model;
    private String color;
    private int year;
    private boolean isReserved;

    //    Declarando um construtor
    public Car(String brand, String model, String color, int year) {
        this();
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    //    Sobrecarga de contrutores, permitindo a instaciação de objeto sem passar argumentos
    public Car() {
        System.out.println("Dentro do construtor sem argumentos!");
    }

    public Car(boolean isReserved) {
        this();
        this.isReserved = isReserved;
    }

    public void print() {
        System.out.println(this.brand);
        System.out.println(this.model);
        System.out.println(this.color);
        System.out.println(this.year);
        System.out.println(this.isReserved);
    }
}

// TODO: https://youtu.be/rW11EAkxFnc?list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW