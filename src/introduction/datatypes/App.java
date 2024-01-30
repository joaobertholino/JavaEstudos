package introduction.datatypes;

public class App {
  public static void main(String[] args) {
    primitiveTypes();
    casting();
    stringType();
  }

  public static void primitiveTypes() {
//        1 byte
    byte byteType = 127;
    System.out.println(byteType);

//        2 bytes
    short shortType = 30000;
    System.out.println(shortType);

//        8 bytes
    long longType = 4564654213743458448L;
    System.out.println(longType);

//        4 bytes
    int intType = 10;
    System.out.println(intType);

//        8 bytes
    double doubleType = 10.5;
    System.out.println(doubleType);

//        4 bytes
    float floatType = 10.5F;
    System.out.println(floatType);

//        2 bytes
    char charTypeOne = 'A';
    System.out.println(charTypeOne);

//        ASCII
    char charTypeTwo = 65;
    System.out.println(charTypeTwo);

//        Unicode
    char charTypeThree = '\u0041';
    System.out.println(charTypeThree);

//        1 bit
    boolean booleanType = true;
    System.out.println(booleanType);
  }

  public static void casting() {
//        Convertendo tipos primitivos, pode ocorrer perda de valores em caso de conversão para tipos menores
    int castingToInt = (int) 10.5;
    System.out.println(castingToInt);
  }

  public static void stringType() {
//        O tipo String não faz parte dos tipos primitivos, e sim um tipo de referencia => Reference Type
    String stringType = "My String";
    System.out.println(stringType);
  }
}
