package poo.constructors;

public class Car {
  private String brand;
  private String model;
  private String color;
  private int year;

//  Declarando um construtor com parametros
  public Car(String brand, String model, String color, int year) {
    this.brand = brand;
    this.model = model;
    this.color = color;
    this.year = year;
  }

//  Declarando um segundo construtor do qual se diferencia do primeiro pelo numero de parametros
  public Car() {
  }

  public void print() {
    System.out.println(STR."Marca: \{this.brand}");
    System.out.println(STR."Modelo: \{this.model}");
    System.out.println(STR."Cor: \{this.color}");
    System.out.println(STR."Ano: \{this.year}");
  }
}