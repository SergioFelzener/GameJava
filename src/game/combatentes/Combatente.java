package game.combatentes;

public class Combatente {
	
	String name;
	int life;
	int power;
	int defesa;
	
	public Combatente(String name, int life, int power) {
		this.name = name;
		this.life = life;
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Combatente [name=" + name + ", life=" + life + ", power=" + power + "]";
	}

	public boolean isAlive() {
		if(life > 0) {
			return true;
		}
		
		return false;
	}
	public void receberAtaque(double dano) {
		if (desviaAtaque()) {
			System.out.println(this.name + " desviou do ataque.");
		} else {
			if (dano > life) {
				life = 0;
			} else {
				life -= dano;
			}
		}
	}
	
	protected boolean desviaAtaque() {
		return false;
	}
	
	public int getDefesa() {
		return this.defesa;
	}
	
	
	
}
