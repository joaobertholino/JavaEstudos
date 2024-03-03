package poo.interfaces.init;

/**
 * Uma interface em Java é um contrato que define um conjunto de métodos abstratos e publicos que uma classe deve
 * implementar. Ela proporciona uma forma de alcançar a abstração e a implementação separada, permitindo que diferentes
 * classes forneçam implementações específicas para os métodos definidos na interface.
 * <p>
 * As interfaces também podem conter constantes (variáveis finais) e métodos estáticos.
 * <p>
 * Uma classe pode implementar várias interfaces, promovendo a flexibilidade e reutilização de código no desenvolvimento
 * orientado a interfaces.
 * <p>
 * Ao implementar uma interface, uma classe se compromete a fornecer uma implementação concreta para todos os métodos
 * abstratos da interface, garantindo conformidade com o contrato estabelecido pela interface.
 * <p>
 * Por padrão, todos os métodos de uma interface são declarado como {@code abstract}(com exceção de métodos estáticos) e
 * com modificador de acesso {@code public}. E as propriedades, por padrão, são declaradas como {@code final} e
 * {@code static}.
 */
public interface DataLoader {
	String VARIABLE_INTERFACE = "Constante declarada em uma interface DataBaseLoader.";

	/**
	 * Em interfaces, métodos estáticos devem possuir corpo junto a sua declaração, assim seguindo a regra de que quando
	 * um método é declarado como {@code static}, o mesmo pertence a interface e não a classe de implementação.
	 */
	static String loadTwo() {
		return "Método estático declarado na interface DataBaseLoader.";
	}

	/**
	 * Declarando método a ser implementado posteriormente.
	 */
	String loadOne();
}
