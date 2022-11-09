package expendedor2d;

public class Comprador {
    private int vuelto;
    private String tomar;
    
    public Comprador(Moneda moneda, int BebidaElegida, Expendedor exp) {
        Bebida bebida = exp.comprarBebida(moneda, BebidaElegida);
        tomar = null;
        vuelto = 0;
        Moneda aux = null;
        while((aux = exp.getVuelto()) != null){
            vuelto = vuelto + aux.getValor();
        }
        if(bebida != null){
            tomar = bebida.beber();
        }else{
            tomar = "nada";
        }
    }
    
    public int cuantoVuelto(){
        return vuelto;
    }
    
    public String queBebiste(){
        return tomar;
    }
}
