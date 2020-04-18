import java.util.Random;


public class Luta {
	Player player1;
	Player player2;
	
	public Luta(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	
	
	public void startFight() {
		
		boolean caraOuCoroa = jogarMoeda();
		this.fight(caraOuCoroa);
		this.checkDeckCards(player1, player2);
		
	}

	public void fight(boolean moeda) {
		
		// Se o cara ou coroa der 1 (Player 1 começa batendo)
		if(moeda) {	
			while(player1.howManyCards() > 0 && player2.howManyCards() > 0 ) {

				// Player pega 1 Card e luta contra Card do Player 2
				Combatente card1 = player1.deck.cards.get(1);
				Combatente card2 = player2.deck.cards.get(1);

				this.porradas(card1, card2);
		
				// Se o Card morreu, ele será removido do Deck
				if(!card1.vivo()){
					player1.deck.cards.remove(0);

				}else{
					player2.deck.cards.remove(0);

				}
				
			}		
			
		}else {
			while(player1.howManyCards() > 0 && player2.howManyCards() > 0 ) {

				// Player pega 1 Card e luta contra Card do Player 1
				Combatente card1 = player2.deck.cards.get(0);
				Combatente card2 = player1.deck.cards.get(0);

				this.porradas(card2, card1);

				// Se o Card morreu, ele será removido do Deck
				if(!card1.vivo()){
					player1.deck.cards.remove(0);

				}else{
					player2.deck.cards.remove(0);

				}
				
			}	
	
		}	
		
	}

	public void porradas(Combatente card1, Combatente card2){

		while(card1.vivo() && card2.vivo()){

			// Combatente Card 1
			int danoCard1 = card1.calcularAtaque();
			card1.subtrairVida(danoCard1);
			System.out.println("O " + card1.nome + "sofreu: " + danoCard1 + " de dano");
			System.out.println(card1.nome + " vida total: " + card1.vidaTotal());
			
			//Combatente Card 2
			int danoCard2 = card2.calcularAtaque();
			card2.subtrairVida(danoCard2);
			System.out.println("O" + card2 + "sofreu: " + danoCard2 + " de dano");
			System.out.println(card2 + " vida total: " + card2.vidaTotal());

		}

		// Rodando infinito...

	}
	
	public boolean jogarMoeda() {
		
		Random random = new Random();
		int moeda = random.nextInt(1);
		
		if(moeda == 1) {
			return true;
		}else {
			return false;
		}	
		
		
	}	
	
	// Adaptar para checar cards existentes (if(< 0) Player perde)
	public void checkDeckCards(Player player1, Player player2) {
		
		if(player1.howManyCards() > 0 && player2.howManyCards() < 1 ) {
			System.out.println("O Player 1 venceu!");
		}else {
			System.out.println("O Player 2 venceu!");
		}
		
	}
	
	
}
	
