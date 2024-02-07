package poo.association.uniderectionalmanytoone;

public class School {
  private String name;
  private Teacher[] teachers;

  public School(String name) {
    this.name = name;
  }

  public School(String name, Teacher[] teachers) {
    this.name = name;
    this.teachers = teachers;
  }

  public void print() {
    System.out.println(STR."Nome da Escola: \{this.name}");
//    Verificando se existem teachers disponiveis na memória, utilizando um if para retornar interrompendo
//    a execução do bloco, evitando NullPointer.
    if (teachers == null) return;
    for (Teacher teacher : teachers) {
      System.out.println(STR."Nome do professor: \{teacher.getName()}");
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Teacher[] getTeachers() {
    return teachers;
  }

  public void setTeachers(Teacher[] teachers) {
    this.teachers = teachers;
  }
}
