import java.util.*;

public class Deck {

    public String nome;
    public List<Combatente> cards = new ArrayList<Combatente>();

    public Deck(List<Combatente> cards, String nome) {
        this.cards = cards;
        this.nome = nome;
	}

}