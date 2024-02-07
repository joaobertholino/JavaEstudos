package objectorientation.polymorphism.iop;

import objectorientation.polymorphism.iop.repository.Repository;
import objectorientation.polymorphism.iop.services.ReposirotyArchive;
import objectorientation.polymorphism.iop.services.RepositoryDataBase;
import objectorientation.polymorphism.iop.services.RepositoryMemory;

/**
 * Declarando uam variavel de referencia do tipo da interface a qual referencia uma classe que implementa essa
 * mesma interface, assim podendo chamar uma implementação especifica do método da interface de cada classe.
 */
public class App {
  public static void main(String[] args) {
    Repository repositoryOne = new RepositoryDataBase();
    repositoryOne.save();

    Repository repositoryTwo = new ReposirotyArchive();
    repositoryTwo.save();

    Repository repositoryThree = new RepositoryMemory();
    repositoryThree.save();
  }
}
