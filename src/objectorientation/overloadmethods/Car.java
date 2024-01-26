package objectorientation.overloadmethods;

/*
    Sobrecarga de método significa a existencia de métodos com o mesmo nome, porem, com quantidade
    de parametros diferentes
*/
public class Car {
    private String brand;
    private String model;
    private String color;
    private int year;
    private boolean isReserved;

    //  Declarando um método init que inicializa varias propriedades simultaneamente
    public void init(String brand, String model, String color, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    /*
        Ao ter que adicionar uma nova propriedade na classe, recomenda-se usar getters e setters e
        não o método init, assim evitando o surgimentos de erros no codigo.
    */
    public boolean getReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public void print() {
        System.out.println(this.brand);
        System.out.println(this.model);
        System.out.println(this.color);
        System.out.println(this.year);
        System.out.println(this.isReserved);
    }
}
