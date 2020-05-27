package game;

import java.util.Map;

import game.combatentes.Combatente;

public class Fight {

	EntradasDeSistema entradaDeSistema = new EntradasDeSistema();
	Sweepstakes sort = new Sweepstakes();
	RunPlay runPlay = new RunPlay();
	
	String player1;
	String player2;
	private int playerCard1;
	private int playerCard2;
	private Map<Integer, Combatente> deckPlayer1;
	private Map<Integer, Combatente> deckPlayer2;

	public Fight(String player1, Map<Integer, Combatente> deckPlayer1, String player2, Map<Integer, Combatente> deckPlayer2) {
		this.deckPlayer1 = deckPlayer1;
		this.deckPlayer2 = deckPlayer2;
		this.player1 = player1;
		this.player2 = player2;
	}

	Combatente vencedor;
	public void startFight() throws InterruptedException {

		while (entradaDeSistema.checkCombatenteVivo(deckPlayer1) > 0 && entradaDeSistema.checkCombatenteVivo(deckPlayer2) > 0) {

			playerCard1 = entradaDeSistema.selectCard(player1, deckPlayer1);
			playerCard2 = entradaDeSistema.selectCard(player2, deckPlayer2);
			Combatente deckCard1 = deckPlayer1.get(playerCard1);
			Combatente deckCard2 = deckPlayer2.get(playerCard2);

			while (deckCard1.isAlive() && deckCard2.isAlive()) {

				int selectPlayer = sort.drawPlayers();			
				vencedor = runPlay.battle(selectPlayer, deckCard1, deckCard2);
			}

			System.out.printf("%s Venceu o Turno \n\n\n", vencedor.getName());
		}

		if (entradaDeSistema.checkCombatenteVivo(deckPlayer1) == 0) {
			System.out.println("*************************************************");
			System.out.printf("*******  %s VENCEU O JOGO PARABENS ***********\n", player2);
			System.out.println("*************************************************");
		} else {
			System.out.println("*************************************************");
			System.out.printf("********* %s VENCEU O JOGO PARABENS  ********\n", player1);
			System.out.println("*************************************************");
		}
	
	}	

}
