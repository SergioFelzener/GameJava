package game.combatentes;

import game.Tipo;

public class Combatente {
	
	String name;
	int life;
	int power;
	int defesa;
	Tipo tipo;
	
	
	
	public Combatente(String name, int life, int power, Tipo tipo) {
		this.name = name;
		this.life = life;
		this.power = power;
		this.tipo = tipo;
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
	public void receberAtaque(double valor) {
		if (desviaAtaque()) {
			System.out.println(this.name + " desviou");
		} else {
			if (valor > life) {
				life = 0;
			} else {
				life -= valor;
			}
		}
	}
	
	protected boolean desviaAtaque() {
		return false;
	}
	
	public int getDefesa() {
		return this.defesa;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	
	
	
}
