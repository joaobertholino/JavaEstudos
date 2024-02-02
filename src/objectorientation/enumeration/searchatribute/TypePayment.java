package objectorientation.enumeration.searchatribute;

public enum TypePayment {
  DEBIT("Método Debito"){
  public double calculateDiscount(double value) {
    return value * 0.1;
  }
},
  CREDIT("Método Credito"){
    public double calculateDiscount(double value){
      return value * 0.05;
    }
  };
  public final String PAYMENT_METHOD;

  TypePayment(String typePayment) {
    this.PAYMENT_METHOD = typePayment;
  }

  public abstract double calculateDiscount(double value);
}