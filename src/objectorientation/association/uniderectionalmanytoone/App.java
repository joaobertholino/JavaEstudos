package objectorientation.association.uniderectionalmanytoone;

public class App {
  public static void main(String[] args) {
//    Sempre preferivel ao instanciar objetos, iniciar pelos objetos que não possuem referencias
    Teacher teacherOne = new Teacher("Adriano Malagoli");
    Teacher teacherTwo = new Teacher("Lucas Portal");

    Teacher[] teachersList = {teacherOne, teacherTwo};

    School schoolOne = new School("SENAI Paulo Skaf", teachersList);

    schoolOne.print();
  }
}
