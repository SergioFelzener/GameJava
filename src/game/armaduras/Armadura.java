package game.armaduras;

public abstract class Armadura {
    
    String name;
    int defenseUp;

    public Armadura(String name, int defenseUp){
        this.defenseUp = defenseUp;
        this.name = name;
    }

    public int getDefense() {
        return this.defenseUp;
    }

    public String getName() {
        return this.name;
    }

}