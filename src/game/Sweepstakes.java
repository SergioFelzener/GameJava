package game;

import java.util.Random;

public class Sweepstakes {
	
	private Random random = new Random();

	public int drawPlayers() {
		int player = random.nextInt(2);
		
		if (player == 0) {
			player = 1;
		} else {
			player = 2;
		}
		return player;
	}

	public int attackRandom(int valor) {
		int ataque = random.nextInt(valor);

		return ataque;
	}

	public boolean defesaRandom() {
		int defesa = random.nextInt(2);

		if (defesa == 1) {
			return true;
		} else {
			return false;
		}
	}


	
	
}
