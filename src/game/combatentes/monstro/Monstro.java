package game.combatentes.monstro;

import game.Tipo;
import game.combatentes.Combatente;

public abstract class Monstro extends Combatente {
	
	public Monstro(String name, int life, int power, Tipo tipo) { 
		super(name, life, power, tipo);
		
	}

}
