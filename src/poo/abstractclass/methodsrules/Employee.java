package poo.abstractclass.methodsrules;

/**
 * Extendendo a classe abstrata {@code Person} na classe, tambem abstrata, {@code Employee}.
 * <p>
 * Classes abstratas que extenden outra classe abstrata, não necessitam sobreescrever métodos herdados dessa classe
 * abstrata, apenas a partir da primeira classe concreta que devera implementar a sobreescrita desses métodos.
 */
public abstract class Employee extends Person {
	protected String name;
	protected double wage;

	public Employee(String name, double wage) {
		this.name = name;
		this.wage = wage;
	}

	public abstract String calculateBonus();
}
