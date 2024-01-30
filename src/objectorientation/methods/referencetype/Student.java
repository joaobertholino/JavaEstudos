package objectorientation.methods.referencetype;

public class Student {
  public String name;
  public int age;
  public char sex;

  //    O this se refere ao objeto a qual está declarado
  public void print() {
    System.out.println(this.name);
    System.out.println(this.age);
    System.out.println(this.sex);
  }
}
