package exceptionsanderrors.runtimeandexceptionerror;

import java.io.File;
import java.io.IOException;

/**
 * Exceções verificadas (checked) e não verificadas (unchecked) são dois tipos de exceções em Java,
 * que diferem em como o compilador as trata durante a compilação e a execução do programa.
 * <p>
 * Exceções verificadas são aquelas que o compilador exige que sejam tratadas explicitamente pelo código.
 * Elas são subclasses de {@code Exception}, exceto {@code RuntimeException} e suas subclasses.
 * Isso significa que métodos que podem gerar exceções verificadas devem declarar essas exceções em suas
 * cláusulas throws ou capturá-las usando blocos {@code try-catch}.
 * Exemplos comuns de exceções verificadas incluem {@code IOException} e {@code SQLException}.
 * <p>
 * Exceções não verificadas, por outro lado, são subclasses de {@code RuntimeException} ou {@code Error}, ou suas subclasses.
 * Elas não precisam ser declaradas explicitamente no código com cláusulas {@code throws} ou capturadas com {@code try-catch}.
 * Exemplos comuns de exceções não verificadas incluem {@code NullPointerException}, {@code ArrayIndexOutOfBoundsException}
 * e {@code ArithmeticException}.
 * <p>
 * É importante entender a distinção entre exceções verificadas e não verificadas ao projetar e escrever código,
 * para garantir que as exceções sejam tratadas adequadamente e para evitar surpresas durante a execução do programa.
 */
public class App {
  public static void main(String[] args) {
    newArchive();
  }

  /**
   * Declarando método que cria novo arquivo em um diretorio especifico e lança um {@code IOException} utilizado
   * {@code tryCatch}.
   * <p>
   * No bloco {@code try} será executado um codigo com possibilidade de lançar erros, caso seja lançado, executara o bloco
   * {@code catch}, cujo o qual, irá imprimir os logs de erro referente ao que foi lançado.
   */
  private static void newArchive() {
    File myFile = new File("src/exceptionsanderrors/runtimeandexceptionerror/exceptionsFolderExemple\\exceptionFile.txt");

    try {
      boolean isNewFileCreated = myFile.createNewFile();
      System.out.println(STR."Arquivo criado: \{isNewFileCreated}");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
