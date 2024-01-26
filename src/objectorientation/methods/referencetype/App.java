package objectorientation.methods.referencetype;

//TODO: Revisar parametros de reference type
public class App {
    public static void main(String[] args) {
        Student myStudentOne = new Student();
        myStudentOne.name = "Joao";
        myStudentOne.age = 21;
        myStudentOne.sex = 'M';

        Student myStudentTwo = new Student();
        myStudentTwo.name = "Ellen";
        myStudentTwo.age = 17;
        myStudentTwo.sex = 'F';

        PrintStudent printStudent = new PrintStudent();

//        Ao passar objetos como argumento, esta sendo passado a referencia desse objeto
        printStudent.print(myStudentOne);
        printStudent.print(myStudentTwo);
    }
}
// https://www.youtube.com/watch?v=0fVZlarZ-Lg&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=52&pp=iAQB