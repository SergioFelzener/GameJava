package game;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import game.armas.Arma;
import game.armas.FactoryArma;
import game.combatentes.Combatente;
import game.combatentes.FactoryCombatente;

public class EntradasDeSistema {
	
	// instanciando Factory Combatentes / Armas
	FactoryCombatente deck = new FactoryCombatente();
	FactoryArma armas = new FactoryArma();
	
	Scanner entrada = new Scanner(System.in);

	public Map<Integer, Combatente> cards = new HashMap<>();

//	Método de seleção de combatentes e armas para o Deck do usuário
	public Map<Integer, Combatente> selectCards(String player) {
		int card = 0;
		int armaCounter = 0;
		
		cards = new HashMap<>();

		while (card < 5) {
			System.out.println();
			System.out.println("-------------------------------------------------------------------------------------------");
			System.out.println(player + " Escolha a " + (card + 1) + "˚ Carta :\n"
																   + "\n(1) - Humano Das Trevas	| (11) - Elementalista		| (21) - Elfo Arqueiro\n"
																   + "(2) - Humano Guerreiro	| (12) - Gandalf		| (22) - Elfo Da Noite\n"
																   + "(3) - Humano Mega Man	| (13) - Lâmina da Morte	| (23) - Elfo Gigante\n"
																   + "(4) - Humano Pistola	| (14) - Mago Celestial		| (24) - Elfo Ladrão\n"
																   + "(5) - Matador de Dragões| (15) - Cubo Gelatinoso	| (25) - Dragão Cromático\n"
																   + "(6) - Orc Assassino	| (16) - Devorador de Mentes	| (26) - Dragão de Fogo\n"
																   + "(7) - Orc Bárbaro	| (17) - Lich			| (27) - Anão Matador\n"
																   + "(8) - Orc da Montanha	| (18) - Tarrasque		| (28) - Anão Ninja\n"
																   + "(9) - Orc Guerreiro	| (19) - Wendigo		| (29) - Anão Malvado\n"
																   + "(10) - Drover BrinKe	| (20) - Engolidor de Anões	| (30) - Anão Jardineiro/n");
			System.out.println("--------------------------------------------------------------------------------------------");

			int opcao = entrada.nextInt();
			Combatente combatente = deck.selectCombatente(opcao);

			System.out.println("-------------------------------------------------------------------------------------------");
			System.out.println(player + " Escolha a " + (armaCounter + 1) + "˚ Arma :\n"
																+ "\n(1) - Espada \n"
																+ "(2) - Foice \n"
																+ "(3) - Pedra \n"
																+ "(4) - Estilingue \n"
																+ "(5) - Machado \n");
			System.out.println("--------------------------------------------------------------------------------------------");

			int opcaoArma = entrada.nextInt();
			Arma arma = armas.selectArma(opcaoArma);

			// combatente -> set machado
			combatente.setArma(arma);

			cards.put(card, combatente);
			card++;
			armaCounter++;
			
		}
		
		return cards;
	}
	
	public int selectCard(String player, Map<Integer, Combatente> deck) {
		
		int cards = 0;

		System.out.printf("%s Escolha sua carta para o COMBATE :  \n\n", player);

		for (Map.Entry<Integer, Combatente> item : deck.entrySet()) {
			if (item.getValue().isAlive()) {
				System.out.println((item.getKey() + 1) + " = " + item.getValue().getName() + " - Life " + item.getValue().getLife());			
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
