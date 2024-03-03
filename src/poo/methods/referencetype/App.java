package poo.methods.referencetype;

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

//    Ao passar objetos como argumento, esta sendo passado a referência desse objeto
		printStudent.print(myStudentOne);
		printStudent.print(myStudentTwo);

		myStudentOne.print();
		myStudentTwo.print();
	}
}