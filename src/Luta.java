import java.util.Random;


public class Luta {
	Combatente lutador1;
	Combatente lutador2;
	
	public Luta(Combatente lutador1, Combatente lutador2) {
		this.lutador1 = lutador1;
		this.lutador2 = lutador2;
	}
	
	
	
	public int calcularAtaque() {
		Random random = new Random();
		int ataque = random.nextInt(10);
		return ataque;
		
	}
	
	public String startFight() {
		while(lutador1.vivo() && lutador2.vivo()) {
			int danoLutador1 = calcularAtaque();
			lutador1.subtrairVida(danoLutador1);
			System.out.println("Lutador 1 sofreu: " + danoLutador1 + " de dano");
			System.out.println("Lutador 1 vida total: " + lutador1.vidaTotal());
			
			int danoLutador2 = calcularAtaque();
			lutador2.subtrairVida(danoLutador2);
			System.out.println("Lutador 2 sofreu: " + danoLutador2 + " de dano");
			System.out.println("Lutador 2 vida total: " + lutador2.vidaTotal());
		}
		
		if(lutador1.vivo()) {
			System.out.println("O lutador 1 venceu!");
		}else {
			System.out.println("O lutador 2 venceu!");
		}
		
		return null;
	}
	

}
	
