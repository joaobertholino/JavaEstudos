package objectorientation.interfaces.multiinterface;

/**
 * Um método default em uma interface Java é uma implementação de método que fornece uma implementação padrão
 * diretamente na interface. Introduzido a partir do Java 8, os métodos default permitem adicionar novos
 * comportamentos a interfaces sem quebrar a compatibilidade com as implementações existentes.
 * <p>
 * Eles são declarados com a palavra-chave 'default' antes do tipo de retorno do método. As classes que implementam
 * a interface podem optar por herdar a implementação padrão do método ou fornecer uma implementação personalizada,
 * substituindo assim o método default.
 * <p>
 * Métodos default são úteis para evoluir interfaces sem afetar as classes existentes, facilitando a adição de
 * funcionalidades sem a necessidade de modificar todas as implementações existentes.
 */
public interface DataLoader {
  String load();

  default String checkPermission() {
    return "Implementação de método default dentro da interface que será sobreescrito na classe!";
  }

  default String vaidation() {
    return "Implementação de método default dentro da interface!";
  }
}
