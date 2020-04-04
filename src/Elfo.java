
public class Elfo extends Combatente implements InterfaceSerMagico{

    public Elfo(String nome, int vida){
        super(nome, vida);
    }

    public String usarMagia() {
        return "Magia...";
    }
}