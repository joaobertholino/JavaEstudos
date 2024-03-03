package poo.interfaces.multiinterface;

/**
 * Implementando as interfaces {@code DataLoader} e {@code DataRemover} na classe {@code DataBaseLoader}, atribuindo um
 * contrato de implementação dos métodos das duas interfaces na classe.
 */
public class DataBaseLoader implements DataLoader, DataRemover {
	@Override
	public String load() {
		return "Executando método load da interface DataLoader implementado na classe DataBaseLoader!";
	}

	@Override
	public String remove() {
		return "Executando método remove da interface DataRemove implementado na classe DataBaseLoader!";
	}

	@Override
	public String checkPermission() {
		return "Executando método checkPermission da interface DataLoader implementado na classe DataBaseLoader!";
	}
}
