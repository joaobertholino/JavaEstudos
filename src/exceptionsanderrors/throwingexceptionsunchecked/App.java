package exceptionsanderrors.throwingexceptionsunchecked;

/**
 * Lançando um exception unchecked onde se efetua-se uma divisão por 0(zero).
 */
public class App {
	public static void main(String[] args) {
		try {
			divide(10, 0);
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		System.out.println("Codigo finalizado!");
	}

	/**
	 * Declarando um método que efetua uma divisão, caso seja uma divisão por 0(zero), será lançado um erro
	 * {@code IllegalArgumentException}, sem o uso de {@code try-catch}.
	 * <p>
	 * Caso não seja feita o tratamento com {@code try-catch}, a execução no codigo será interrompida.
	 */
	private static int divide(int x, int y) {
		if (y == 0) throw new IllegalArgumentException("Argumento ilegal!");
		return x / y;
	}
}
