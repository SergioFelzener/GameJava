package game.armaduras;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import game.armaduras.armaduraDeAço.ArmaduraDeAço;
import game.armaduras.cotaSagrada.CotaSagrada;
import game.armaduras.robeNinja.RobeNinja;
import game.armaduras.roupasCasuais.RoupasCasuais;
import game.armaduras.trajeDeCombate.TrajeDeCombate;

public class FactoryArmadura {
    
    public Map<Integer, Armadura> armaduraCollection = new HashMap<>();

    public void createArmaduras() {
        armaduraCollection.put(1, new ArmaduraDeAço());
        armaduraCollection.put(2, new CotaSagrada());
        armaduraCollection.put(3, new RobeNinja());
        armaduraCollection.put(4, new RoupasCasuais());
        armaduraCollection.put(5, new TrajeDeCombate());
    }

    public void listar() {
        for(Entry<Integer, Armadura> registro: armaduraCollection.entrySet()) {
			System.out.print(registro.getKey() + "-");
			System.out.println(registro.getValue());
			
		}
    }

    public Armadura selectArmadura(int num) {
        this.createArmaduras();
        return armaduraCollection.get(num);
    }

}