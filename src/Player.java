
public class Player {

    public String nome;
    public Deck deck;

    public Player( String nome, Deck deck){
        this.nome = nome;
        this.deck = deck;
    }

    // Método para pegar a quantidade de cartas do Deck
    public int howManyCards(){
        return this.deck.getDeckSize();

    }

    // Método para pegar as cartas vivas do Deck (Passar esse método para classe Deck)
    public int howManyCardsAlive(){
        int counterVivos = 0;

        for(int i = 0; i < this.deck.getDeckSize(); i++){

            if(this.deck.getCards().get(i).vivo()){
                counterVivos++;
            }
            
        }

        // Retornando a quantidade de Cards vivas apenas
        return counterVivos;
        
    }

    public String toString() {
    	return this.nome;
    	
    }
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}