package poo.polymorphism.polymorphicparameters.services;

import poo.polymorphism.polymorphicparameters.domain.Product;

/**
 * Declarando um método que recebe um parametro do tipo {@code Product} e retorna no console os métodos do objeto
 * passado como argumento.
 */
public class CalculateTax {
	public static void calculateTaxProduct(Product product) {
		System.out.println("Relatorio do produto:");
		System.out.println(STR."Nome do produto: \{product.getName()}");
		System.out.println(STR."Valor do produto: \{product.getValue()}");
		System.out.println(STR."Imposto do produto: \{product.calculateTaxPercent()}");
	}
}
