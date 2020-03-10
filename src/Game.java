public class Game {

	public static void main(String[] args) {	
		
		Combatente lutador1 = new Combatente("Dragao Elemental", 100 );
		Combatente lutador2 = new Combatente("Elfo da floresta", 100);

		Luta porradaria = new Luta(lutador1, lutador2);
		
		porradaria.startFight();
		
	}

}
