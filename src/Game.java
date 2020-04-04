public class Game {

	public static void main(String[] args) {	
		
		Combatente lutador1 = new Elfo("Jogador 1", 100 );
		Combatente lutador2 = new Mago("Jogador 2", 100, "Fogo");

		Luta porradaria = new Luta(lutador1, lutador2);
		
		porradaria.startFight();
		
	}

}
