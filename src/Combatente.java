
// COMECANDO CLASSE COMBATENTE 


public class Combatente {
	String nome;
	int vida = 100;
	int ataque;
	boolean vivo;
	
	public Combatente(String nome, int vida, int ataque) {
		this.nome = nome;
		this.vida = vida;
		this.ataque = ataque;
	}
	
	public int vidaTotal() {
		return vida;
	}
	
	public int subtrairVida(int valor) {
		vida -= valor;
		return vida;
		
	}
	public boolean vivo () {
		if (vidaTotal() > 0) {
			return true;
		} else {
			return false;
		}
	}
	


		
	
	
}


