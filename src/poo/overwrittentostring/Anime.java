package poo.overwrittentostring;

public class Anime {
	private String name;

	public Anime(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Sempre ao chamar uma variavel de referencia, o método {@code toString} é executado, por padrão.
	 * <p>
	 * Ao sobreescrever um método, nunca se deve alterar o modificador de acesso para um que seja mais restrito que o
	 * original.
	 * <p>
	 * A notação {@code @Overrride} garante que o método esta sendo sobreescrito.
	 */
	@Override
	public String toString() {
		return STR."Anime{name='\{name}\{'\''}\{'}'}";
	}
}
