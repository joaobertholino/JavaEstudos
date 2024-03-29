package poo.enumeration.constructorsandatribute;

import poo.enumeration.constructorsandatribute.Client.TypePayment;

/**
 * Ao importar a classe enum, descarta a necessidade de passar a enumeração junto ao nome da classe.
 */
public class App {
	public static void main(String[] args) {
		Client clientOne = new Client("Ellen", TypeClient.PESSOA_FISICA, TypePayment.DEBIT);
		System.out.println(clientOne);

		Client clientTwo = new Client("Nicolas", TypeClient.PESSOA_JURIDICA, TypePayment.CREDIT);
		System.out.println(clientTwo);
	}
}
