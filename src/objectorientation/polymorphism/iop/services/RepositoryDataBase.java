package objectorientation.polymorphism.iop.services;

import objectorientation.polymorphism.iop.repository.Repository;

public class RepositoryDataBase implements Repository {
  @Override
  public void save() {
    System.out.println("Implementação do método save da interface Repository na classe RepositoryDataBase!");
  }
}
