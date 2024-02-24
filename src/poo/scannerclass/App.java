package poo.scannerclass;

import java.util.Scanner;

/**
 * Scanner => Fornece métodos simples para ler diferentes tipos de dados, como inteiros, doubles, strings, etc, a partir
 * do teclado ou de outros fluxos de entrada.
 */
public class App {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite seu nome abaixo:");
    String nextLine = input.nextLine();

    System.out.println("Digite sua idade abaixo:");
    int nextInt = input.nextInt();

    System.out.println("Digite M ou F para seu sexo abaixo:");
    char nextChar = input.next().charAt(0);
    if (nextChar != 'M' && nextChar != 'F') {
      System.out.println("Sexo invalido! Insira novamente:");
      nextChar = input.next().charAt(0);
    }

    System.out.println(STR."Seu nome é: \{nextLine}, sua idade é: \{nextInt} e seu sexo é: \{nextChar}.");
    input.close();
  }
}
