package game;

import game.combatentes.Combatente;

public class RunPlay extends Play {

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
				System.out.printf("** Player 1 %s Attack POWER (%.1f) **\n** Player 2 %s -%.1f\n\n",
						combatente1.getName(), attack, combatente2.getName(), attack);
				combatente2.receberAtaque(attack);
			} else {
				double defesa = combatente2.getDefesa();
				double valorAttack = attack - defesa;

				System.out.printf("** Player 1 - %s ** Attack POWER (%.1f)\n", combatente1.getName(), attack);
				System.out.printf("** Player 2 - %s ** Defendeu (%.1f) seu ataque foi de (%.1f)\n",
						combatente2.getName(), defesa, valorAttack);

				if (valorAttack < 0) {
					System.out.println("** Ataque Foi totalmente Bloqueado **\n");
					combatente2.receberAtaque(0);
				} else {
					System.out.printf(" --==> BELA DEFESA <==-- \nReduziu o ataque em %.1f pontos.\n\n", defesa);
					combatente2.receberAtaque(valorAttack);
					Thread.sleep(200);
				}
			}
			System.out.println("-----------------------------------------------------------\n");
			System.out.printf("%s Life = %s\n", combatente1.getName(), combatente1.getLife());
			System.out.printf("%s Life = %s\n\n", combatente2.getName(), combatente2.getLife());
			System.out.println("-----------------------------------------------------------\n");
		} else {
			double attack = drawFight.attackRandom(combatente2.getPower());
			boolean defende = drawFight.defesaRandom();
			if (defende == false) {

				System.out.printf("** Player 2 - %s Attack POWER (%.1f) **\n** Player 1 - %s ** -%.1f\n\n",
						combatente2.getName(), attack, combatente1.getName(), attack);
				combatente1.receberAtaque(attack);
			} else {
				double defesa = combatente1.getDefesa();
				double valorAttack = attack - defesa;
	
				System.out.printf("** Player 2 - %s Attack POWER (%.1f) **\n", combatente2.getName(), attack);
				System.out.printf("** Player 1 - %s ** Defendeu (%.1f) seu ataque foi de (%.1f)\n",
						combatente1.getName(), defesa, valorAttack);

				if (valorAttack < 0) {
					System.out.println("** Ataque Foi totalmente Bloqueado **\n");
					combatente1.receberAtaque(0);
				} else {
					System.out.printf("** %s Defendeu ** \n", combatente1.getName());
					System.out.printf(" --==> BELA DEFESA <==-- \nReduziu o ataque em %.1f pontos.\n\n", defesa);
					combatente1.receberAtaque(valorAttack);
				}
			}
			Thread.sleep(200);
			System.out.println("-----------------------------------------------------------\n");
			System.out.printf("%s Life = %s\n", combatente1.getName(), combatente1.getLife());
			System.out.printf("%s Life = %s\n\n", combatente2.getName(), combatente2.getLife());
			System.out.println("-----------------------------------------------------------\n");

		}
	}

	private Combatente getVencedor(Combatente combatente1, Combatente combatente2) {
		if (combatente1.isAlive()) {
			return combatente1;
		} else {
			return combatente2;
		}
	}

}
