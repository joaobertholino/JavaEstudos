package exceptionsanderrors.introduction;

// TODO: Revisar exceptionsFolderExemple e errors

/**
 * As exceções e erros em Java representam situações anormais que ocorrem durante a execução de um programa. Exceções
 * são eventos que ocorrem durante a execução do programa e que interrompem o fluxo normal de execução, enquanto os
 * erros indicam problemas sérios que geralmente não podem ser recuperados.
 * <p>
 * Exceções são objetos que encapsulam informações sobre o problema encontrado, incluindo uma mensagem descritiva e a
 * pilha de chamadas que levou à exceção. Elas podem ser capturadas e tratadas pelo código usando blocos
 * {@code try-catch} ou podem ser propagadas para métodos superiores usando {@code throws}.
 * <p>
 * Erros, por outro lado, geralmente indicam problemas irrecuperáveis ou de natureza fatal, como falta de memória ou
 * falhas na JVM. Eles geralmente não são capturados ou tratados pelo código e geralmente indicam a necessidade de
 * intervenção externa, como ajustar a configuração do sistema ou corrigir o código.
 * <p>
 * <p>
 * Exemplos comuns de exceções incluem:
 * <p>
 * {@code NullPointerException} => Lançada quando se tenta acessar um membro de um objeto que é null.
 * <p>
 * {@code ArrayIndexOutOfBoundsException} => Lançada quando se tenta acessar um índice fora dos limites de um array.
 * <p>
 * {@code IOException} => Lançada quando ocorre um erro durante a leitura ou escrita de dados.
 * <p>
 * {@code FileNotFoundException} => Lançada quando um arquivo solicitado não é encontrado.
 * <p>
 * {@code ClassNotFoundException} => Lançada quando uma classe não pode ser encontrada pelo ClassLoader.
 * <p>
 * {@code StackOverflowError} => Lançada a pilha de chamadas recursivas se torna muito profunda, excedendo a capacidade
 * disponível da pilha de execução.
 */
public class App {

  /**
   * Exemplo de {@code StackOverflowError} utilizando recursividade
   */
  public static void main(String[] args) {
    recursion();
  }

  public static void recursion() {
    recursion();
  }
}
