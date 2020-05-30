package game.combatentes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import game.combatentes.anao.AnaoJardineiro;
import game.combatentes.anao.AnaoMalvado;
import game.combatentes.anao.AnaoMatador;
import game.combatentes.anao.AnaoNinja;
import game.combatentes.dragao.DragaoCromatico;
import game.combatentes.dragao.DragaoDoFogo;
import game.combatentes.elfo.ElfoArqueiro;
import game.combatentes.elfo.ElfoDaNoite;
import game.combatentes.elfo.ElfoGigante;
import game.combatentes.elfo.ElfoLadrao;
import game.combatentes.human.Human;
import game.combatentes.human.HumanDasTrevas;
import game.combatentes.human.HumanGuerreiro;
import game.combatentes.human.HumanMegaMan;
import game.combatentes.human.HumanPistola;
import game.combatentes.human.MatadorDeDragoes;
import game.combatentes.mago.DroverBrink;
import game.combatentes.mago.Elementalista;
import game.combatentes.mago.Gandalf;
import game.combatentes.mago.LaminaDaMorte;
import game.combatentes.mago.MagoCelestial;
import game.combatentes.monstro.CuboGelatinoso;
import game.combatentes.monstro.DevoradorDeMentes;
import game.combatentes.monstro.EngolidorDeAnao;
import game.combatentes.monstro.Lich;
import game.combatentes.monstro.Tarrasque;
import game.combatentes.monstro.Wendigo;
import game.combatentes.orc.Orc;
import game.combatentes.orc.OrcAssassino;
import game.combatentes.orc.OrcBarbaro;
import game.combatentes.orc.OrcDaMontanha;
import game.combatentes.orc.OrcGuerreiro;

public class FactoryCombatente {
	
	public Map<Integer, Combatente> cardCollection = new HashMap<>();
	
	public void createCards() {
		cardCollection.put(1, new HumanDasTrevas());
		cardCollection.put(2, new HumanGuerreiro());
		cardCollection.put(3, new HumanMegaMan());
		cardCollection.put(4, new HumanPistola());
		cardCollection.put(5, new MatadorDeDragoes());
		cardCollection.put(6, new OrcAssassino());
		cardCollection.put(7, new OrcBarbaro());
		cardCollection.put(8, new OrcDaMontanha());
		cardCollection.put(9, new OrcGuerreiro());
		cardCollection.put(10, new DroverBrink());
		cardCollection.put(11, new Elementalista());
		cardCollection.put(12, new Gandalf());
		cardCollection.put(13, new LaminaDaMorte());
		cardCollection.put(14, new MagoCelestial());
		cardCollection.put(15, new CuboGelatinoso());
		cardCollection.put(16, new DevoradorDeMentes());
		cardCollection.put(17, new Lich());
		cardCollection.put(18, new Tarrasque());
		cardCollection.put(19, new Wendigo());
		cardCollection.put(20, new EngolidorDeAnao());
		cardCollection.put(21, new ElfoArqueiro());
		cardCollection.put(22, new ElfoDaNoite());
		cardCollection.put(23, new ElfoGigante());
		cardCollection.put(24, new ElfoLadrao());
		cardCollection.put(25, new DragaoCromatico());
		cardCollection.put(26, new DragaoDoFogo());
		cardCollection.put(27, new AnaoMatador());
		cardCollection.put(28, new AnaoNinja());
		cardCollection.put(29, new AnaoMalvado());
		cardCollection.put(30, new AnaoJardineiro());
	}
	
	public void listar() {
		for(Entry<Integer, Combatente> registro: cardCollection.entrySet()) {
			System.out.print(registro.getKey() + "-");
			System.out.println(registro.getValue());
			
		}
		
	}

	public Combatente selectCombatente(int num) {
		this.createCards();
		return cardCollection.get(num);
	}
	
}
