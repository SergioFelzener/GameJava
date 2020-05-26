package game;

import java.util.Map;

import game.combatentes.Combatente;

public class Fight {

	EntradasDeSistema entradaDeSistema = new EntradasDeSistema();
	Sweepstakes sort = new Sweepstakes();
	RunPlay runPlay = new RunPlay();
	

	private int playerCard1;
	private int playerCard2;
	private Map<Integer, Combatente> deckPlayer1;
	private Map<Integer, Combatente> deckPlayer2;

	public Fight(Map<Integer, Combatente> deckPlayer1, Map<Integer, Combatente> deckPlayer2) {
		this.deckPlayer1 = deckPlayer1;
		this.deckPlayer2 = deckPlayer2;
	}

	Combatente vencedor;
	public void startFight() throws InterruptedException {

		while (entradaDeSistema.checkCombatenteVivo(deckPlayer1) > 0 && entradaDeSistema.checkCombatenteVivo(deckPlayer2) > 0) {

			playerCard1 = entradaDeSistema.selectCard(1, deckPlayer1);
			playerCard2 = entradaDeSistema.selectCard(2, deckPlayer2);
			Combatente deckCard1 = deckPlayer1.get(playerCard1);
			Combatente deckCard2 = deckPlayer2.get(playerCard2);

			while (deckCard1.isAlive() && deckCard2.isAlive()) {

				int selectPlayer = sort.sorteiaJogadores();			
				vencedor = runPlay.battle(selectPlayer, deckCard1, deckCard2);
			}

			System.out.printf("%s Vendeu o Turno \n", vencedor.getName());
		}

		if (entradaDeSistema.checkCombatenteVivo(deckPlayer1) == 0) {
			System.out.println("Player 2 venceu o JOGO PARABENS");
		} else {
			System.out.println("Player 1 venceu o JOGO PARABENS");
		}
	
	}	

}
