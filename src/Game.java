import java.util.*;

public class Game {

	public static void main(String[] args) {
		
		// Scanner para pegar input dos players
		Scanner scanner = new Scanner(System.in);

		// Factory para Fabricar os Cards com o Tipo passado pelos usuários
		FactoryCombatente factory = new FactoryCombatente();

		// PLAYER 1 --------------------------------------------------------
		// Pegando o nome do Player 1
		System.out.println("Digite o nome do Player 1: ");
		String player1Name = scanner.next();

		// Lista de cards para o Deck
		List<Combatente> cardsPlayer1 = new ArrayList<Combatente>();

		// Pegando a primeira Card escolhida pelo usuário 1
		System.out.println("Digite o numero da primeira Card do seu Deck: ");
		System.out.println("(1) Elfo (2) Orc (3) Mago");
		int player1cardNumber1 = scanner.nextInt();

		// Pegando o nome da Primeira Card do usuário 1
		System.out.println("Digite o nome da primeira Card: ");
		String player1card1Name = scanner.next();

		// Pegando a segunda Card escolhida pelo usuário 1
		System.out.println("Digite o numero da segunda Card do seu Deck: ");
		System.out.println("(1) Elfo (2) Orc (3) Mago");
		int player1cardNumber2 = scanner.nextInt();

		// Pegando o nome da Primeira Card do usuário 1
		System.out.println("Digite o nome da segunda Card: ");
		String player1card2Name = scanner.next();

		// Criando Card com a Factory
		Combatente player1card1 = factory.getCombatente(player1card1Name, 100, player1cardNumber1);
		Combatente player1card2 = factory.getCombatente(player1card2Name, 100, player1cardNumber2);

		// Adicionando os Cards para a lista de Cards
		cardsPlayer1.add(player1card1);
		cardsPlayer1.add(player1card2);

		// Criando um Deck e adicionando os Cards a ele
		Deck deckPlayer1 = new Deck(cardsPlayer1, "Deck do Player 1");

		// Criando o Player 1 com o Nome obtido e o Deck criado
		Player player1 = new Player(player1Name, deckPlayer1);

		System.out.printf("Criado player %s\n", player1);


		// PLAYER 2 --------------------------------------------------------
		// Pegando o nome do Player 2
		System.out.println("Digite o nome do Player 2: ");
		String player2Name = scanner.next();

		// // Lista de cards para o Deck
		List<Combatente> cardsPlayer2 = new ArrayList<Combatente>();

		// Pegando a primeira Card escolhida pelo usuário 2
		System.out.println("Digite o numero da primeira Card do seu Deck: ");
		System.out.println("(1) Elfo (2) Orc (3) Mago");
		int player2cardNumber1 = scanner.nextInt();

		// Pegando o nome da Primeira Card do usuário 2
		System.out.println("Digite o nome da primeira Card: ");
		String player2card1Name = scanner.next();

		// Pegando a segunda Card escolhida pelo usuário 2
		System.out.println("Digite o numero da segunda Card do seu Deck: ");
		System.out.println("(1) Elfo (2) Orc (3) Mago");
		int player2cardNumber2 = scanner.nextInt();

		// Pegando o nome da Primeira Card do usuário 1
		System.out.println("Digite o nome da segunda Card: ");
		String player2card2Name = scanner.next();

		// Criando Card com a Factory
		Combatente player2card1 = factory.getCombatente(player2card1Name, 100, player2cardNumber1);
		Combatente player2card2 = factory.getCombatente(player2card2Name, 100, player2cardNumber2);

		// Adicionando os Cards para a lista de Cards
		cardsPlayer2.add(player2card1);
		cardsPlayer2.add(player2card2);

		// Criando um Deck e adicionando os Cards a ele
		Deck deckPlayer2 = new Deck(cardsPlayer2, "Deck do Player 2");

		// Criando o Player 1 com o Nome obtido e o Deck criado
		Player player2 = new Player(player2Name, deckPlayer2);
		
		System.out.printf("%s Criado\n", player2);

		// Fechando o Scanner ;)
		scanner.close();

		// Batalha dos decks
		Luta batalhaDosDecks = new Luta(player1, player2);

		// Game Start
		batalhaDosDecks.startFight();

	}

}
