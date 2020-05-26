package game;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import game.combatentes.Combatente;
import game.combatentes.FactoryCombatente;

public class EntradasDeSistema {
	
	// instanciando Factory Combatentes
	FactoryCombatente deck = new FactoryCombatente();
	Play play = new Play();
	
	
	Scanner entrada = new Scanner(System.in);

	public Map<Integer, Combatente> cards = new HashMap<>();

//	Método de seleção de combatentes para o Deck do usuário
	public Map<Integer, Combatente> selectCards(int player) {
		int card = 0;
		
		
		cards = new HashMap<>();

		while (card < 2) {
			System.out.println();
			System.out.println("-------------------------------");
			System.out.println("Player "+ player + " Escolha a " + (card + 1) + "˚ Carta :\n(1) - ORC \n(2) - Human");
			System.out.println("-------------------------------");
			int opcao = entrada.nextInt();
			Combatente combatente = deck.selectCombatente(opcao);
			cards.put(card, combatente);
			card++;
			
		}
		
		return cards;
	}
	
	public int selectCard(int jogador, Map<Integer, Combatente> deck) {

		System.out.printf("Escolha sua Carta Player%d\n\n", jogador);

		for (Map.Entry<Integer, Combatente> item : deck.entrySet()) {
			if (item.getValue().isAlive()) {
				System.out.println((item.getKey() + 1) + " = " + item.getValue().getName() + " - Vida " + item.getValue().getLife());			
			}
		}

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
