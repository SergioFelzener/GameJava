public class Combatente {
	String nome;
	int vida;
	boolean vivo;
	
	public Combatente(String nome, int vida) {
		this.nome = nome;
		this.vida = vida;
	}
	
	
	
	
	public int vidaTotal() {
		return this.vida;
	}
	
	public int subtrairVida(int valor) {
		this.vida -= valor;
		return this.vida;
		
	}
	
	public boolean vivo () {
		if (vidaTotal() > 0) {
			return true;
		} else {
			return false;
		}
	}
	

}


