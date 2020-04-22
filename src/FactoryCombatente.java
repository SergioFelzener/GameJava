
public class FactoryCombatente {

    public Combatente getCombatente(String nome, int vida, int cardNumber){
        if(cardNumber == 1){
            return new Elfo(nome, vida );
        }
           
        if(cardNumber == 2){
            return new Orc(nome, vida );
        }

        if(cardNumber == 3){
            return new Mago(nome, vida, "Elemento");
        }

        return null;

    }
}