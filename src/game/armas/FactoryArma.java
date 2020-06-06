package game.armas;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import game.armas.Espada.Espada;
import game.armas.Foice.Foice;
import game.armas.Pedra.Pedra;
import game.armas.Estilingue.Estilingue;
import game.armas.Machado.Machado;

public class FactoryArma {

    public Map<Integer, Arma> armaCollection = new HashMap<>();

    public void createArmas() {
        armaCollection.put(1, new Espada());
        armaCollection.put(2, new Foice());
        armaCollection.put(3, new Pedra());
        armaCollection.put(4, new Estilingue());
        armaCollection.put(5, new Machado());
    }

    public void listar() {
        for(Entry<Integer, Arma> registro: armaCollection.entrySet()) {
			System.out.print(registro.getKey() + "-");
			System.out.println(registro.getValue());
			
		}
    }

    public Arma selectArma(int num) {
        this.createArmas();
        return armaCollection.get(num);
    }
    
}