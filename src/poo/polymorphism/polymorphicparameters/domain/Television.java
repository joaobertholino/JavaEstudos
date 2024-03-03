package poo.polymorphism.polymorphicparameters.domain;

public class Television extends Product {
	public static final double TAX_PERCENT = 0.21;

	public Television(String name, double value) {
		super(name, value);
	}

	@Override
	public double calculateTaxPercent() {
		return this.value * TAX_PERCENT;
	}
}
