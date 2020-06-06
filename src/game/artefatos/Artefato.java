package game.artefatos;

public class Artefato {
    String name;
    int power;

    public Artefato(String name, int power){
        this.name = name;
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }

    public String getName() {
        return this.name;
    }
    
}