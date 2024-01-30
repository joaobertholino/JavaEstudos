package objectorientation.gettersandsetters;

// Ao definir propriedades como private, sera promovido o desacoplamento das classe e objetos
public class Person {
    //    private => So sera acessivel pela classe
    private String name;
    private int age;
    private double wage;

    public String getName() {
        return name;
    }

    //    Declarando métodos getters e setters para poder ter acesso às propriedades privadas
    public void setName(String name) {
        this.name = name;
    }

    //    Sempre que for um método getter, retorna o valor e não recebe nenhum argumento
    public int getAge() {
        return age;
    }

    //    Sempre que for um método setter, retorna void e recebe um valor como argumento
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Idade invalida!");
            return;
        }
        this.age = age;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0) {
            System.out.println("Salario invalido!");
            return;
        }
        this.wage = wage;
    }
}
