package game.combatentes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FactoryCombatente {
	
	public Map<Integer, Combatente> cardCollection = new HashMap<>();
	
	public void createCards() {
		cardCollection.put(1, new Orc());
		cardCollection.put(2, new Human());
	}
	
	public void listar() {
		for(Entry<Integer, Combatente> registro: cardCollection.entrySet()) {
			System.out.print(registro.getKey() + "-");
			System.out.println(registro.getValue());
			
		}
		
	}

	public Combatente selectCombatente(int num) {
		this.createCards();
		return cardCollection.get(num);
	}
	
}
