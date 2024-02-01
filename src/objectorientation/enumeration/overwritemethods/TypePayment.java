package objectorientation.enumeration.overwritemethods;

// TODO: Estudar Strategy Pattern
public enum TypePayment {
//  Declarando um método para um valor de enumeração, do qual, sobreescreve um método declarado fora do escopo
  DEBIT{
  @Override
  public double calculateDiscount(double value) {
    return value * 0.1;
  }
},
  CREDIT{
    @Override
    public double calculateDiscount(double value){
      return value * 0.05;
    }
  };

//  Depois de declarar métodos para todos os valores de enumeração, o método declarado fora de escopo passa a não ser
//  mais utilizado, sendo necessario a declaração dele como um método abstrato e sem corpo
  public abstract double calculateDiscount(double value);
}