package poo.enumeration.searchatribute;

public enum TypePayment {
	/**
	 * Implementando métodos que carregam logicas especificas para cada valor de enumeração.
	 */
	DEBIT("Debito") {
		@Override
		public double calculateDiscount(double value) {
			return value * 0.1;
		}
	},
	CREDIT("Crédito") {
		@Override
		public double calculateDiscount(double value) {
			return value * 0.05;
		}
	};

	public final String paymentType;

	TypePayment(String type) {
		this.paymentType = type;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public abstract double calculateDiscount(double value);
}