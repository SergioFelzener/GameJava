import java.util.*;

public class Game {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		// Pegando o nome do Player 1
		System.out.println("Digite o nome do Player 1: ");
		String player1Name = scanner.nextLine();

		// Lista de cards para o Deck
		List<Combatente> cardsPlayer1 = new ArrayList<Combatente>();

		// Pegando as Cards escolhidas pelo usuário
		System.out.println("Digite o numero de uma Card para o seu Deck: ");
		System.out.println("(1) Elfo (2) Orc (3) Mago");
		int player1cardNumber1 = scanner.nextInt();

		// Pegando o nome da Primeira Card do usuário
		System.out.println("Digite o nome da Card 1: ");
		String player1card1Name = scanner.nextLine();

		// Factory para Fabricar os Cards com o Tipo passado pelo Usuário
		FactoryCombatente factory = new FactoryCombatente();

		Combatente player1card = factory.getCombatente(player1card1Name, 100, player1cardNumber1);

		// Criando um card (Combatente) para ser um Card
		Combatente cardPlayer1 = new Elfo("Elfo do fogo", 100 );

		// Criando um segundo card (Combatente) para ser um Card
		Combatente card2Player1 = new Elfo("Elfo da noite", 100 );

		// Adicionando os Cards para a lista de Cards
		cardsPlayer1.add(cardPlayer1);
		cardsPlayer1.add(card2Player1);

		// Criando um Deck e adicionando os Cards a ele
		Deck deckPlayer1 = new Deck(cardsPlayer1, "Deck do Player 1");

		// Criando o Player 1 com o Nome obtido e o Deck criado
		Player player1 = new Player(player1Name, deckPlayer1);

		// System.out.println(player1);


		// Pegando o nome do Player 2
		// System.out.println("Digite o nome do Player 2: ");
		// String player2Name = scanner.nextLine();

		// Fechando o Scanner ;)
		scanner.close();

		// Lista de cards para o Deck
		List<Combatente> cardsPlayer2 = new ArrayList<Combatente>();
		
		// Criando um card (Combatente) para ser um Card
		Combatente cardPlayer2 = new Orc("Orc das montanhas", 100 );

		// Criando um segundo card (Combatente) para ser um Card
		Combatente card2Player2 = new Orc("Orc desdentado", 100 );

		// Adicionando os Cards para a lista de Cards
		cardsPlayer2.add(cardPlayer2);
		cardsPlayer2.add(card2Player2);

		// Criando um Deck e adicionando os Cards a ele
		Deck deckPlayer2 = new Deck(cardsPlayer2, "Deck do Player 2");

		// Criando o Player 1 com o Nome obtido e o Deck criado
		// Player player2 = new Player(player2Name, deckPlayer2);

		// System.out.println(player1);

		// Batalha dos decks
		// Luta batalhaDosDecks = new Luta(player1, player2);

		// Game Start
		// batalhaDosDecks.startFight();

	}

}
