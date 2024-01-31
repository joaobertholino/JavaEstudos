package objectorientation.enumeration.intro;

public class Client {
  private String name;
//  Associando a classe typeClient com a classe Client
  private typeClient typeClient;

//  Utilizando um construtor para força a passagem de um argumento para o typeClient que
//  corresponda aos valores passados dentro da classe enum
  public Client(String name, typeClient typeClient) {
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

  public typeClient getTypeClient() {
    return typeClient;
  }

  public void setTypeClient(typeClient typeClient) {
    this.typeClient = typeClient;
  }
}
