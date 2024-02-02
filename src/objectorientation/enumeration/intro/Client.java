package objectorientation.enumeration.intro;

public class Client {
  private String name;
  //  Declarando uma associação unidirecional da classe Client com a classe Enum TypeClient
  private TypeClient typeClient;

//  Utilizando um construtor para forçar a passagem de um argumento para o TypeClient que
//  corresponda aos valores declarados dentro da classe enum
  public Client(String name, TypeClient typeClient) {
    this.name = name;
    this.typeClient = typeClient;
  }

  @Override
  public String toString() {
    return STR."Client{name='\{name}\{'\''}, typeClient=\{typeClient}\{'}'}";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TypeClient getTypeClient() {
    return typeClient;
  }

  public void setTypeClient(TypeClient typeClient) {
    this.typeClient = typeClient;
  }
}
