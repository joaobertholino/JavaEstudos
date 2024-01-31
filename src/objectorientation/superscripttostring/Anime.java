package objectorientation.superscripttostring;

public class Anime {
  private String name;

  public Anime(String name) {
    this.name = name;
  }

//  Ao sobreescrever um método, nunca alterar o modificador de acesso para um que seja mais restrito que o original
//  A notação @Overrride garante que o método esta sendo sobreescrito
  @Override
  public String toString() {
    return STR."Anime{name='\{name}\{'\''}\{'}'}";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
