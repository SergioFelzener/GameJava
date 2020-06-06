package game.armas;

public abstract class Arma {

    String name;
    int powerUp;
    
    public Arma(String name, int powerUp){
        this.powerUp = powerUp;
        this.name = name;
    }

    public int getPower() {
        return this.powerUp;
    }

    public String getName() {
        return this.name;
    }

}