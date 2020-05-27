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
		
		
		
//		String player1 = JOptionPane.showInputDialog("Digite player 1 ");
//		String player2 = JOptionPane.showInputDialog("Digite player 2 ");
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
	
		Map<Integer, Combatente> player1Cards = entradaSistema.selectCards(player1.getName());
		Map<Integer, Combatente> player2Cards = entradaSistema.selectCards(player2.getName());
		
//		System.out.println("cartas : " + playerCards1);
//		System.out.println("cartas : " + playerCards2);
		
		Fight fight = new Fight(player1.getName(), player1Cards, player2.getName(),player2Cards);
		fight.startFight();
		
	entrada.close();

		
	}

	
	
	

}
