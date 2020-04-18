
public class Player {

    public String nome;
    public Deck deck;

    public Player( String nome, Deck deck){
        this.nome = nome;
        this.deck = deck;
    }

    public int howManyCards(){
        return this.deck.cards.size();
    }

}