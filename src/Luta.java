import java.util.Random;


public class Luta {
	
	// New Lutadores;
	Combatente lutador1 = new Combatente("Dragão Elemental", 100, 10 );
	Combatente lutador2 = new Combatente("Elfo da floresta", 100, 7 );
	
	public int calcularAtaque() {
		Random random = new Random();
		int ataque = random.nextInt(10);
		return ataque;
		
	}
	
	
	public String figth() {
		
	}
	

}
	
