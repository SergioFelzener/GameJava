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

    // Método para pegar a quantidade de Cards
    public int getDeckSize(){
        return this.cards.size();

    }

    // Método para pegar as cartas mortas do Deck
    public void removeDeadCard(){

        for(int i = 0; i < this.getDeckSize(); i++){

            Combatente card = this.getCards().get(i);

            if(!card.vivo){
                this.cards.remove(i);
            }

        }
        
    }

}