package objectorientation.classe;

public class App {
    public static void main(String[] args) {
//        Instanciando um novo objeto studentOne a partir da classe Student
        Student studentOne = new Student();

//        Atribuindo valores as propriedades do objeto
        studentOne.name = "João";
        System.out.println(studentOne.name);

        studentOne.age = 21;
        System.out.println(studentOne.age);

        studentOne.sex = 'M';
        System.out.println(studentOne.sex);

        final String message = STR."Olá, meu nome é \{studentOne.name}, tenho \{studentOne.age} anos e sou do sexo \{studentOne.sex}(Masculino).";
        System.out.println(message);
    }
}
