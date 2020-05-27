package game;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import game.combatentes.Combatente;
import game.combatentes.FactoryCombatente;

public class EntradasDeSistema {
	
	// instanciando Factory Combatentes
	FactoryCombatente deck = new FactoryCombatente();
	
	Scanner entrada = new Scanner(System.in);

	public Map<Integer, Combatente> cards = new HashMap<>();

//	Método de seleção de combatentes para o Deck do usuário
	public Map<Integer, Combatente> selectCards(String player) {
		int card = 0;
		
		
		cards = new HashMap<>();

		while (card < 2) {
			System.out.println();
			System.out.println("-------------------------------");
			System.out.println(player + " Escolha a " + (card + 1) + "˚ Carta :\n(1) - ORC \n(2) - Human");
			System.out.println("-------------------------------");
			int opcao = entrada.nextInt();
			Combatente combatente = deck.selectCombatente(opcao);
			cards.put(card, combatente);
			card++;
			
		}
		
		return cards;
	}
	
	public int selectCard(String player, Map<Integer, Combatente> deck) {
		
		int cards = 0;

		System.out.printf("%s Escolha sua carta para o COMBATE :  \n\n", player);

		for (Map.Entry<Integer, Combatente> item : deck.entrySet()) {
			if (item.getValue().isAlive()) {
				System.out.println((item.getKey() + 1) + " = " + item.getValue().getName() + " - Vida " + item.getValue().getLife());			
			}
		}

		cards++;
		int changeCard = (entrada.nextInt() -1);
		return changeCard;
	}

	public int checkCombatenteVivo(Map<Integer, Combatente> deck) {
		int cont = 0;

		for (Map.Entry<Integer, Combatente> item : deck.entrySet()) {
			if (item.getValue().isAlive()) {
				cont++;
			}
		}

		return cont;
	}
}
