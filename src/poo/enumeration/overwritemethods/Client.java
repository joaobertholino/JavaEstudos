package poo.enumeration.overwritemethods;

public class Client {
	private final String name;
	private final TypeClient typeClient;
	private final TypePayment typePayment;

	public Client(String name, TypeClient typeClient, TypePayment typePayment) {
		this.name = name;
		this.typeClient = typeClient;
		this.typePayment = typePayment;
	}

	public String getName() {
		return name;
	}

	public TypeClient getTypeClient() {
		return typeClient;
	}

	public TypePayment getTypePayment() {
		return typePayment;
	}

	@Override
	public String toString() {
		return STR."Client{name='\{name}\{'\''}, typeClient=\{typeClient}, typeClientNameReport=\{typeClient.nameReport}, typeClientValue=\{typeClient.VALUE}, typePayment=\{typePayment}\{'}'}";
	}
}
