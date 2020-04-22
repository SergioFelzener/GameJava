import java.util.Random;


public class Luta {
	Player player1;
	Player player2;
	
	public Luta(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	
	
	public void startFight() {
		
		// Decidindo na moeda virtual quem começa (true = player 1, false = player 2)
		boolean caraOuCoroa = jogarMoeda();

		// começando a Fight
		this.fight(caraOuCoroa);

		// Checando o vencedor
		this.checkDeckCards(player1, player2);
		
	}

	public void fight(boolean moeda) {
		
		// Se o cara ou coroa der 1 (Player 1 começa batendo) (REFATORAR*)
		if(moeda) {	
			// Enquanto os jogadores tiverem Cards vivas, eles vão lutar
			while(player1.howManyCardsAlive() > 0 && player2.howManyCardsAlive() > 0 ) {

				// loop no Deck, pega uma carta e Luta (1 v 1)
				for(int i = 0; i < player1.deck.getDeckSize(); i++){
					Combatente card1 = player1.deck.getCards().get(i);
					Combatente card2 = player2.deck.getCards().get(i);
					this.porradas(card1, card2);

				}		
				
				// Limpa as Cards mortas do Deck
				player1.deck.removeDeadCard();
				player2.deck.removeDeadCard();
				
			}		
			
		}else {
			// Enquanto os jogadores tiverem Cards vivas, eles vão lutar
			while(player1.howManyCardsAlive() > 0 && player2.howManyCardsAlive() > 0 ) {

				// loop no Deck, pega uma carta e Luta (1 v 1)
				for(int i = 0; i < player1.deck.getDeckSize(); i++){
				Combatente card1 = player2.deck.getCards().get(i);
				Combatente card2 = player1.deck.getCards().get(i);
				this.porradas(card1, card2);

				}

				// Limpa as Cards mortas do Deck
				player1.deck.removeDeadCard();
				player2.deck.removeDeadCard();

			}	
	
		}	
		
	}

	public void porradas(Combatente card1, Combatente card2){

		// Enquanto os Cards estão vivos , eles descem a porrada (REFATORAR*)
		while(card1.vivo() && card2.vivo()){

			// Combatente Card 1
			int danoCard1 = card1.calcularAtaque();
			card1.subtrairVida(danoCard1);
			System.out.println("O " + card1.nome + " sofreu: " + danoCard1 + " de dano");
			System.out.println(card1.nome + " vida total: " + card1.vidaTotal());
			
			//Combatente Card 2
			int danoCard2 = card2.calcularAtaque();
			card2.subtrairVida(danoCard2);
			System.out.println("O " + card2.nome + " sofreu: " + danoCard2 + " de dano");
			System.out.println(card2.nome + " vida total: " + card2.vidaTotal());

		}

		// Se o Card morrer, envia uma mensagem no terminal
		if(!card1.vivo()){
			System.out.println("Card " + card1.nome + " morreu");
						
		}else{
			System.out.println("Card " + card2.nome + " morreu");
						
		}

	}
	
	// Decisão randômica para o inicio da batalha
	public boolean jogarMoeda() {
		
		Random random = new Random();
		int moeda = random.nextInt(1);
		
		if(moeda == 1) {
			return true;
		}else {
			return false;
		}		
		
	}	
	
	// Verifica quem quem venceu por possuir o ultimo card vivo (REFATORAR*)
	public void checkDeckCards(Player player1, Player player2) {
		
		if(player1.howManyCardsAlive() > 0 && player2.howManyCardsAlive() < 1 ) {
			System.out.println("O Player " + player1.nome + " venceu!");

		}else{
				System.out.println("O Player " + player2.nome + " venceu!");

			}
			
		}
		
}