package game.artefatos;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import game.artefatos.amuleto.AmuletoDasTrevas;
import game.artefatos.anel.AnelDaLuz;
import game.artefatos.brinco.BrincoDeJade;
import game.artefatos.pena.PenaDosAnjos;
import game.artefatos.pulseira.PulseiraDeSauron;

public class FactoryArtefatos {

    public Map<Integer, Artefato> artefatoCollection = new HashMap<>();

    public void createArtefatos() {
        artefatoCollection.put(1, new AmuletoDasTrevas());
        artefatoCollection.put(2, new AnelDaLuz());
        artefatoCollection.put(3, new PulseiraDeSauron());
        artefatoCollection.put(4, new BrincoDeJade());
        artefatoCollection.put(5, new PenaDosAnjos());
    }

    public void listar() {
        for(Entry<Integer, Artefato> registro: artefatoCollection.entrySet()) {
			System.out.print(registro.getKey() + "-");
			System.out.println(registro.getValue());
			
		}
    }

    public Artefato selectArtefato(int num) {
        this.createArtefatos();
        return artefatoCollection.get(num);
    }
    
}