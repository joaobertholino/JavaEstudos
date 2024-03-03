package poo.inicializationblocks;

public class App {
	public static void main(String[] args) {
		Anime myAnime = new Anime("One Piece");
		for (int episode : myAnime.getEpisodes()) {
			System.out.println(STR."Episodio numero: \{episode}");
		}
	}
}
