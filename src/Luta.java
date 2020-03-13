import java.util.Random;


public class Luta {
	Combatente lutador1;
	Combatente lutador2;
	
	public Luta(Combatente lutador1, Combatente lutador2) {
		this.lutador1 = lutador1;
		this.lutador2 = lutador2;
	}
	
	
	public void startFight() {
		
		boolean caraOuCoroa = jogarMoeda();
		this.fight(caraOuCoroa);
		this.checkLife(lutador1, lutador2);
		
	}

	public void fight(boolean moeda) {
		
		if(moeda) {
			
			while(lutador1.vivo() && lutador2.vivo()) {
				int danoLutador1 = lutador1.calcularAtaque();
				lutador1.subtrairVida(danoLutador1);
				System.out.println("Lutador 1 sofreu: " + danoLutador1 + " de dano");
				System.out.println("Lutador 1 vida total: " + lutador1.vidaTotal());
				
				//lutador2()	
				int danoLutador2 = lutador2.calcularAtaque();
				lutador2.subtrairVida(danoLutador2);
				System.out.println("Lutador 2 sofreu: " + danoLutador2 + " de dano");
				System.out.println("Lutador 2 vida total: " + lutador2.vidaTotal());
				
			}		
			
		}else {
			
			while(lutador1.vivo() && lutador2.vivo()) {
				int danoLutador2 = lutador2.calcularAtaque();
				lutador2.subtrairVida(danoLutador2);
				System.out.println("Lutador 2 sofreu: " + danoLutador2 + " de dano");
				System.out.println("Lutador 2 vida total: " + lutador2.vidaTotal());
				
				//lutador1()
				int danoLutador1 = lutador1.calcularAtaque();
				lutador1.subtrairVida(danoLutador1);
				System.out.println("Lutador 1 sofreu: " + danoLutador1 + " de dano");
				System.out.println("Lutador 1 vida total: " + lutador1.vidaTotal());
			
			}		
		}	
		
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
	
	
	public void checkLife(Combatente lutador1, Combatente lutador2) {
		
		if(lutador1.vivo()) {
			System.out.println("O lutador 1 venceu!");
		}else {
			System.out.println("O lutador 2 venceu!");
		}
		
	}
	
	
}
	
