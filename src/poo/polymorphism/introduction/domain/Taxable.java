package poo.polymorphism.introduction.domain;

/**
 * Declarando uma interface com apenas o método {@code calculateTax} responsavel por fornecer os métodos a serem
 * implementados nas classes concretas {@code Computer} e {@code Keyboard}.
 */
public interface Taxable {
	double calculateTaxPercent();
}
