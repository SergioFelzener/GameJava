package game;

import java.util.Map;
import java.util.Scanner;

import game.combatentes.Combatente;

public class Play {
	

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("*********************");
		System.out.println("**  RPG CARD GAME  **");
		System.out.println("*********************");
		System.out.println();
		
		// Iniciando Game recebendo o nome dos players
		Scanner entrada = new Scanner(System.in);
		System.out.print("Olá Player 1 - Digite seu nome : ");
		Player player1 = new Player(entrada.next());
		System.out.print("Olá Player 2 - Digite seu nome : ");
		Player player2 = new Player(entrada.next());
		
		System.out.println("-------------------------------\n");
		System.out.println("************************");
		System.out.printf("**  Sejam Bem Vindos  **\n");
		System.out.println("************************");
		System.out.println();
		System.out.printf("Player1 - %s\n", player1.getName());
		System.out.printf("Player2 - %s\n", player2.getName());

		EntradasDeSistema entradaSistema = new EntradasDeSistema();
	
		Map<Integer, Combatente> playerCards1 = entradaSistema.selectCards(1);
		Map<Integer, Combatente> playerCards2 = entradaSistema.selectCards(2);
		
//		System.out.println("cartas : " + playerCards1);
//		System.out.println("cartas : " + playerCards2);
		
		Fight fight = new Fight(playerCards1, playerCards2);
		fight.startFight();
		
	entrada.close();

		
	}

	
	
	

}
