package expendedor2d;

import java.util.ArrayList;

public class DepositoVuelto {
    private ArrayList <Moneda> monto;
    
    public DepositoVuelto(){
        monto = new ArrayList <Moneda>();
    }
    
    public void addMoneda(Moneda m, int precioBebida){
        int resto=(m.getValor() - precioBebida);
        if(resto>=0){
            for(int i=(int) resto/100; i>0; i--){
                monto.add(new Moneda100());
            } 
        }else{
            for(int i=(int) m.getValor()/100; i>0; i--){
                monto.add(new Moneda100());
            }
        }
    }
    
    public Moneda getMoneda(){
        if(monto.size() == 0){
            return null;
        }else{
            return monto.remove(0);
        }
    }
}
