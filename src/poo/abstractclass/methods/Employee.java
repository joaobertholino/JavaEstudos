package poo.abstractclass.methods;

public abstract class Employee {
	protected String name;
	protected double wage;

	public Employee(String name, double wage) {
		this.name = name;
		this.wage = wage;
	}

	/**
	 * Declarando um método abstrato que será obrigatoriamente implementado em todas as subClasses que o extenden.
	 * <p>
	 * Uma classe concreta não pode ter métodos abstratos, porem, uma classe abstrata pode ter metodos concretos e
	 * abstratos juntos.
	 */
	public abstract String calculateBonus();
}
