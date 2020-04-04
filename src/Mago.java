
public class Mago extends Combatente implements InterfaceSerMagico{

    String elemento;

    public Mago(String nome, int vida, String elemento){
        super(nome, vida);
        this.elemento = elemento;
    }

    public String usarMagia(){
        return "Magia...";
    }

    public String getElemento(){
        return this.elemento;
    }

}