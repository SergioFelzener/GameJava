package game;

import java.util.Random;

public class Sweepstakes {

	private Random rand = new Random();

	public int attackRandom(int valor) {
		int ataque = rand.nextInt(valor);

		return ataque;
	}

	public boolean defesaRandom() {
		int sort = rand.nextInt(4);

		if (sort == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int sorteiaJogadores() {
		int player = rand.nextInt(2);

		if (player == 0) {
			player = 1;
		} else {
			player = 2;
		}

		return player;
	}

	
	
}
