package game.combatentes.dragao;

import game.Tipo;
import game.combatentes.Combatente;

public abstract class Dragao extends Combatente {
	
	public Dragao(String name, int life, int power, Tipo tipo) {
		super(name, life, power, tipo);
	}

}
