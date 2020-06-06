package game.combatentes;

import game.Tipo;
import game.armaduras.Armadura;
import game.armas.Arma;
import game.artefatos.Artefato;

public class Combatente {
	
	String name;
	int life;
	int power;
	int defesa;
	Tipo tipo;
	Arma arma;
	Armadura armadura;
	Artefato artefato;
	
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
		return (this.life + this.artefato.getPower());
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getPower() {
		return (this.power + this.arma.getPower());
	}

	public void setPower(int power) {
		this.power = power;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public void setArmadura(Armadura armadura){
		this.armadura = armadura;
	}

	public void setArtefato(Artefato artefato){
		this.artefato = artefato;
	}

	public int getDefesa() {
		return (this.defesa + this.armadura.getDefense());
	}

	public Tipo getTipo() {
		return this.tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
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
		if (this.desviaAtaque()) {
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
	
	
}
