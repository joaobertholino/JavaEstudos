package poo.enumeration.overwritemethods;

// TODO: Estudar metodos de valores de enumeração
public class App {
	/**
	 * Chamando os metodos de enumeração e atribuindo o valor a uma constante.
	 */
	public static void main(String[] args) {
		final double debitMethod = TypePayment.DEBIT.calculateDiscount(100);
		final double fisicalPerson = TypeClient.PESSOA_FISICA.calculateDiscount(100);
		System.out.println(STR."Valor do desconto no debito: \{debitMethod}%");
		System.out.println(STR."Valor do desconto para pessoa fisica: \{fisicalPerson}%");

		final double creditMethod = TypePayment.CREDIT.calculateDiscount(100);
		final double juridicalPerson = TypeClient.PESSOA_JURIDICA.calculateDiscount(100);
		System.out.println(STR."Valor do desconto no credito: \{creditMethod}%");
		System.out.println(STR."Valor do desconto para pessoa fisica: \{juridicalPerson}%");

		Client myClientOne = new Client("Joao", TypeClient.PESSOA_FISICA, TypePayment.DEBIT);
		final double clientOneDiscont = myClientOne.getTypeClient().calculateDiscount(100);
		System.out.println(clientOneDiscont);
	}
}
