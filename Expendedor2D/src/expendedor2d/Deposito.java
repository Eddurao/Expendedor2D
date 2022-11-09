package expendedor2d;

import java.util.ArrayList;

public class Deposito {
    private ArrayList <Bebida> bebida;
    
    public Deposito(){
        bebida = new ArrayList <Bebida>();
    }
    public void addBebida(Bebida b){
        if(b != null){
            bebida.add(b);
        }
    }
    public Bebida getBebida(){
        if(bebida.size() == 0)
            return null;
        else
            return bebida.remove(0);
    }
}
