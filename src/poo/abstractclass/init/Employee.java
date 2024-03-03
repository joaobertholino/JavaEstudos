package poo.abstractclass.init;

/**
 * Uma classe abstrata é uma classe que não pode ser instanciada diretamente, sendo destinada a ser estendida por
 * subclasses concretas. Ela pode conter métodos abstratos, que são declarados, mas não implementados na classe
 * abstrata, exigindo que as subclasses forneçam suas próprias implementações. Além disso, uma classe abstrata pode
 * conter métodos concretos (com implementação) e variáveis de instância. A utilização de classes abstratas proporciona
 * um mecanismo eficiente para compartilhar código comum entre classes relacionadas, ao mesmo tempo que permite a
 * personalização através de subclasses.
 */
public abstract class Employee {
	protected String name;
	protected double wage;

	public Employee(String name, double wage) {
		this.name = name;
		this.wage = wage;
	}

	public abstract String abstractExemple();
}
