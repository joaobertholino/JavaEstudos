package introduction.conditionals;

public class App {

  /**
   * Caso a condicional retorne true, executa o bloco de codigo correspondente, caso nenhuma retorne true, executa o
   * bloco else
   */
  public static void main(String[] args) {
    ifElse();
    ternary();
    switchCase();
  }

  /**
   * ifElse => Caso retorne true, executa o bloco de codigo if, caso retorne false, executa o bloco else
   */
  public static void ifElse() {
    int age = 21;
    if (age < 14) {
      System.out.println("Criança!");
    } else if (age >= 14 && age < 18) {
      System.out.println("Adolescente!");
    } else if (age >= 18 && age <= 30) {
      System.out.println("Adulto!");
    } else {
      System.out.println("Idoso!");
    }
  }

  /**
   * Ternary => Estrutura condicional com sintaxe oneLine
   */
  public static void ternary() {
    double sale = 6000;
    String messageTrue = STR."Salario maior que 5000 => Valor do salario: \{sale}";
    String messageFalse = STR."Salario menor que 5000 => Valor do salario: \{sale}";

    String resultOne = (sale >= 5000) ? messageTrue : messageFalse;
    System.out.println(resultOne);

    int age = 17;
    String statusOne = "Criança!";
    String statusTwo = "Adolescente!";
    String statusThree = "Adulto!";
    String statusFour = "Idoso!";

    String resultTwo = (age < 14) ? statusOne : (age >= 14 && age < 18) ? statusTwo : (age >= 18 && age <= 30) ? statusThree : statusFour;
    System.out.println(resultTwo);
  }

  /**
   * Switch => Executa um bloco de codigo de acordo com o caso passado, se não tiver correspondencia, executa o
   * bloco default
   */
  public static void switchCase() {
    byte day = 5;

//    Aceita apenas os tipos => char, int, byte, short, enum, String
    switch (day) {
      case 1:
        System.out.println("Domingo");
        break;
      case 2:
        System.out.println("Segunda");
        break;
      case 3:
        System.out.println("Terça");
        break;
      case 4:
        System.out.println("Quarta");
        break;
      case 5:
        System.out.println("Quinta");
        break;
      case 6:
        System.out.println("Sexta");
        break;
      case 7:
        System.out.println("Sabado");
        break;
      default:
        System.out.println("Dia invalido!");
        break;
    }

    switch (day) {
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
        System.out.println("Dia util!");
        break;
      case 1:
      case 7:
        System.out.println("Final de semana!");
        break;
      default:
        System.out.println("Dia invalido!");
        break;
    }
  }
}
