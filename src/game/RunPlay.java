package game;

import game.combatentes.Combatente;

public class RunPlay {
	
	Sweepstakes drawFight = new Sweepstakes();

	public Combatente battle(int sorteado, Combatente combatente1, Combatente combatente2) throws InterruptedException {
		toBattle(sorteado, combatente1, combatente2);
		return getVencedor(combatente1, combatente2);
	}

	private void toBattle(int sorteado, Combatente combatente1, Combatente combatente2) throws InterruptedException {
		// Criando Logica de Ataque 
		if (sorteado == 1) {
			double attack = drawFight.attackRandom(combatente1.getPower());
			boolean defende = drawFight.defesaRandom();
			if (defende == false) {
				System.out.printf("** Player 1 %s Attack POWER (%.1f) **\n** Player 2 %s -%.1f\n", combatente1.getName(), attack, combatente2.getName(), attack);
				combatente2.receberAtaque(attack);
			} else {
				double ataqueMenosDefesa = attack - combatente2.getDefesa();
				if (ataqueMenosDefesa < 0) {
					ataqueMenosDefesa = 0;
				}
				
				System.out.printf("** Player 1 - %s ** Attack POWER (%.1f)\n", combatente1.getName(), attack);
				System.out.printf("** Player 2 - %s ** Defendeu %.1f (%.1f)\n", combatente2.getName(),ataqueMenosDefesa, attack);
				combatente2.receberAtaque(ataqueMenosDefesa);
			}
			System.out.printf("%s Life = %s\n", combatente1.getName(), combatente1.getLife());
			System.out.printf("%s Life = %s\n\n", combatente2.getName(), combatente2.getLife());

		} else {
			double valorAtaque = drawFight.attackRandom(combatente2.getPower());
			boolean defendeu = drawFight.defesaRandom();
			if (defendeu == false) {
				System.out.printf("** Player 1 - %s Attack POWER (%.1f) **\n** Player 2 - %s ** -%.1f\n", combatente1.getName(), valorAtaque, combatente2.getName(), valorAtaque);
				combatente1.receberAtaque(valorAtaque);
			} else {
				System.out.printf("** Player 2 - %s Attack POWER (%.1f) **\n-- Player 1 %s defendeu (%s)\n", combatente2.getName(), valorAtaque, combatente1.getName(), combatente1.getDefesa());
				System.out.printf("** Player 1 - %s Defendeu ** \n", combatente1.getName());
				combatente1.receberAtaque(1);
			}
			System.out.printf("%s Life = %s\n", combatente1.getName(), combatente1.getLife());
			System.out.printf("%s Life = %s\n\n", combatente2.getName(), combatente2.getLife());

		}
	}

	private Combatente getVencedor(Combatente combatente1, Combatente combatente2) {
		if (combatente1.isAlive()) {
			return combatente1;
		} else {
			return combatente2;
		}
	}
	//Thread.sleep(500);

}
