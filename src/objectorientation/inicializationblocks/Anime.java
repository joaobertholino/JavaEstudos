package objectorientation.inicializationblocks;

// TODO: Revisar blocos de inicialização
public class Anime {
    private String name;
    private final int[] episodes;

    //    Declarando um bloco de inicialização que sera executado independente do construtor que sera chamado posteriormente
    {
        System.out.println("Dentro do bloco de inicialização!");
        episodes = new int[100];

        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    //    A inicialização das propriedades do objeto acontece antes da execução do construtor
    public Anime() {
        System.out.println("Dentro do bloco do construtor sem parametros!");
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
