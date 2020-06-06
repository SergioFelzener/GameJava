package game.combatentes.human;

import game.Tipo;
import game.combatentes.Combatente;

public abstract class Human extends Combatente {

	
	public Human(String name, int life, int power, Tipo tipo) {
		super(name, life, power, tipo);
	}
	

}
