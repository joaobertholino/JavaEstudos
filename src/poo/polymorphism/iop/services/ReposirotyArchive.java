package poo.polymorphism.iop.services;

import poo.polymorphism.iop.repository.Repository;

public class ReposirotyArchive implements Repository {
	@Override
	public void save() {
		System.out.println("Implementação do método save da interface Repository na classe RepositoryArchive!");
	}
}
