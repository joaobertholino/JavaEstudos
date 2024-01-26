package objectorientation.gettersandsetters;

//TODO: Revisar Getters and Setters
public class App {
    public static void main(String[] args) {
        Person myPerson = new Person();

//        Utilizando métodos set para atribuir valores a propriedades
        myPerson.setName("João");
        myPerson.setAge(21);
        myPerson.setWage(7287);

//        Utilizando métodos get para pegar valores das propriedades
        final String nameMyPerson = myPerson.getName();
        System.out.println(nameMyPerson);

        final int ageMyPerson = myPerson.getAge();
        System.out.println(ageMyPerson);

        final double saleMyPerson = myPerson.getWage();
        System.out.println(saleMyPerson);
    }
}
