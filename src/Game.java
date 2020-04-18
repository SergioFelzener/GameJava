import java.util.*;

public class Game {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		// Pegando o nome do Player 1
		System.out.println("Digite o nome do Player 1: ");
		String player1Name = scanner.nextLine();
		scanner.close();

		// Lista de cards para o Deck
		List<Combatente> cards = new ArrayList<Combatente>();

		// Criando um card (Combatente) para ser um Card
		Combatente elfoDoFogo = new Elfo("Jogador 1", 100 );

		// Adicionando o Card para a lista de Cards
		cards.add(elfoDoFogo);

		// Criando um Deck e adicionando os Cards a ele
		Deck deck = new Deck(cards, "Deck do Player 1");

		// Criando o Player 1 com o Nome obtido e o Deck criado
		Player player1 = new Player(player1Name, deck);

		System.out.println(player1);

		// Combatente lutador2 = new Mago("Jogador 2", 100, "Fogo");
		// Luta porradaria = new Luta(lutador1, lutador2);		
		// porradaria.startFight();
		
	}

}
