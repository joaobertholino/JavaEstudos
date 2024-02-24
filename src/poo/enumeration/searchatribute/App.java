package poo.enumeration.searchatribute;

public class App {
  /**
   * {@code valueOf} => Método estatico que retorna o valor de enumeração com base no argumento passado, sendo esse
   * argumento uma correspondencia exata ao valor de enumeração.
   */
  public static void main(String[] args) {
    TypeClient typeClientOne = TypeClient.valueOf("PESSOA_FISICA");
    System.out.println(typeClientOne);

    TypeClient typeClientTwo = TypeClient.searchForNameReport("Pessoa Juridica");
    System.out.println(typeClientTwo);

    TypeClient typeClientThree = TypeClient.searchForNameReport("Valor Invalido");
    System.out.println(typeClientThree);
  }
}
