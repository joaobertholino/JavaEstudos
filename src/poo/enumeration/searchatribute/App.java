package poo.enumeration.searchatribute;

// TODO: Estudar atributos de enumeração
public class App {
	/**
	 * {@code valueOf} => Método estático que retorna o valor de enumeração com base no argumento passado, sendo esse
	 * argumento uma correspondencia exata ao valor de enumeração.
	 */
	public static void main(String[] args) {
		TypeClient typeClientOne = TypeClient.valueOf("PESSOA_FISICA");
		System.out.println(typeClientOne);

		TypeClient typeClientTwo = TypeClient.searchForNameReport("Pessoa Juridica");
		System.out.println(typeClientTwo);

		TypeClient typeClientThree = TypeClient.searchForNameReport("Valor Invalido");
		System.out.println(typeClientThree);

		int typeClientMethodOne = TypeClient.PESSOA_FISICA.getValue();
		System.out.println(STR."Valor de identificação de \{TypeClient.PESSOA_FISICA}: \{typeClientMethodOne}");

		String typeClientMethodTwo = TypeClient.PESSOA_JURIDICA.getNameReport();
		System.out.println(STR."Valor de nameReport de \{TypeClient.PESSOA_JURIDICA}: \{typeClientMethodTwo}");

		double typePaymentMethodOne = TypePayment.DEBIT.calculateDiscount(15);
		System.out.println(STR."Valor de desconto retornado pelo método calculateDiscount para \{TypePayment.DEBIT}: \{typePaymentMethodOne}");

		double typePaymentMethodTwo = TypePayment.CREDIT.calculateDiscount(15);
		System.out.println(STR."Valor de desconto retornado pelo método calculateDiscount para \{TypePayment.CREDIT}: \{typePaymentMethodTwo}");
	}
}
