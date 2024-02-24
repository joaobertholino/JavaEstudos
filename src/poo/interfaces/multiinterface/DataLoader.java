package poo.interfaces.multiinterface;

/**
 * Ordem dos modificares de acesso do mais retristivo ao mais liberal: Não é permitido a declaração de um modificador
 * mais retristivo que o padrão(public).
 * <p>
 * {@code private} => O acesso é permitido apenas dentro da própria classe.
 * <p>
 * {@code default} => O acesso é permitido apenas dentro do mesmo pacote.
 * <p>
 * {@code protected} => O acesso é permitido apenas para classes no mesmo pacote ou subclasses.
 * <p>
 * {@code public} => O acesso é permitido de qualquer lugar, dentro ou fora do pacote.
 */
public interface DataLoader {

  /**
   * Declarando método {@code load} na interface {@code DataLoader} que será implementando na classe
   * {@code DataBaseLoader}.
   */
  String load();

  /**
   * Declarando métodos default {@code checkPermission} e {@code validation} na interface {@code DataLoader}
   */
  default String checkPermission() {
    return "Implementação de método default na interface DataLoader que será sobreescrito na classe DataBaseLoader!";
  }

  default String validation() {
    return "Implementação de método default na interface DataLoader!";
  }
}
