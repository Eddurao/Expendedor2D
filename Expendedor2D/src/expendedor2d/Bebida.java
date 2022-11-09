package expendedor2d;

abstract public class Bebida {
    private int numSerie;
    
    public Bebida(int numSerie){
        this.numSerie = numSerie;
    }
    public int getSerie(){
        return this.numSerie;
    }
    public abstract String beber();
}

class Sprite extends Bebida{
    
    public Sprite(int numSerie){
        super(numSerie);
    }
    @Override
    public String beber(){
        return "Sprite";
    }
}

class CocaCola extends Bebida{
    
    public CocaCola(int numSerie){
        super(numSerie);
    }
    @Override
    public String beber(){
        return "CocaCola";
    }
}
class Fanta extends Bebida{
    
    public Fanta(int numSerie){
        super(numSerie);
    }
    @Override
    public String beber(){
        return "Fanta";
    }
}
