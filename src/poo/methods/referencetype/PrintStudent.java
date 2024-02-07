package poo.methods.referencetype;

public class PrintStudent {
  public void print(Student myStudent) {
    myStudent.name = "Nicolas";

    System.out.println(myStudent.name);
    System.out.println(myStudent.age);
    System.out.println(myStudent.sex);
  }
}
