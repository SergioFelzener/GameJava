import java.util.*;

public class Deck {

    public String nome;
    public List<Combatente> cards = new ArrayList<Combatente>();

    public Deck(List<Combatente> cards, String nome) {
        this.cards = cards;
        this.nome = nome;
    }
    
    public List<Combatente> getCards() {
        return this.cards;
    }

    public Combatente removeCard(int index ){
        this.cards.remove(index);
        return this.cards.get(index);
        
    }

}