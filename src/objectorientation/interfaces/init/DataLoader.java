package objectorientation.interfaces.init;

/**
 * Uma interface em Java é um contrato que define um conjunto de métodos abstratos e publicos que uma classe deve implementar.
 * Ela proporciona uma forma de alcançar a abstração e a implementação separada, permitindo que diferentes classes
 * forneçam implementações específicas para os métodos definidos na interface.
 * <p>
 * As interfaces também podem conter constantes (variáveis finais) e métodos estáticos.
 * <p>
 * Uma classe pode implementar
 * várias interfaces, promovendo a flexibilidade e reutilização de código no desenvolvimento orientado a interfaces.
 * <p>
 * Ao implementar uma interface, uma classe se compromete a fornecer uma implementação concreta para todos os métodos
 * abstratos da interface, garantindo conformidade com o contrato estabelecido pela interface.
 */
public interface DataLoader {
  String VARIABLE_INTERFACE = "Constante declarada em uma interface DatabaseLoader.";

  String loadOne();

  static String loadTwo() {
    return "Método estatico declarado na interface DatabaseLoader.";
  }
}
