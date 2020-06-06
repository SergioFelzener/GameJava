package game.combatentes.orc;

import game.Tipo;
import game.combatentes.Combatente;

public abstract class Orc extends Combatente {
	
	public Orc(String name, int life, int power, Tipo tipo) {
		super(name, life, power, tipo);	
	}

}
