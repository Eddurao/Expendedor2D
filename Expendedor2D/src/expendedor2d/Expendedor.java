package expendedor2d;

public class Expendedor {
    private Deposito Coca;
    private Deposito Sprite;
    private Deposito Fanta;
    private DepositoVuelto MonVu;
    private int precioBebidas;
    public static int COCA = 1;
    public static int SPRITE = 2;
    public static int FANTA = 3;
    
    public Expendedor(int numBebidas, int precioBebidas){
        MonVu = new DepositoVuelto();
        this.precioBebidas = precioBebidas;
        Coca = new Deposito();
        Sprite = new Deposito();
        Fanta = new Deposito();
        
        if(numBebidas != 0){
            for(int i=0; i<numBebidas; i++){
                Coca.addBebida(new CocaCola(100+i));
            }
            for(int i=0; i<numBebidas; i++){
                Sprite.addBebida(new Sprite(200+i));
            }
            for(int i=0; i<numBebidas; i++){
                Fanta.addBebida(new Fanta(300+i));
            }
        }
    }
    
    public Bebida comprarBebida(Moneda moneda, int Elegida){
        Bebida bebida1= null;
        Bebida bebida2=null;
        Bebida bebida3 = null;
        if(moneda == null){
            return null;
        }
        if(moneda.getValor() >= precioBebidas){
            if(Elegida == 1){
                bebida1 = Coca.getBebida();
                if(bebida1 == null){
                    MonVu.addMoneda(moneda, 0);
                }else{
                    MonVu.addMoneda(moneda, precioBebidas);
                }
                return bebida1;
            }else if(Elegida == 2){
                bebida2 = Sprite.getBebida();
                if(bebida2 == null){
                    MonVu.addMoneda(moneda, 0);
                }else{
                    MonVu.addMoneda(moneda, precioBebidas);
                }
                return bebida2;
            }else if(Elegida == 3){
                bebida3 = Fanta.getBebida();
                if(bebida3 == null){
                    MonVu.addMoneda(moneda,0);
                }else{
                    MonVu.addMoneda(moneda, precioBebidas);
                }
                return bebida3;
            }else{
                if(moneda != null){
                    MonVu.addMoneda(moneda,0);
                    return null;
                }
            }
        }
        else{
            if(moneda == null){
                return null;
            }else{
                MonVu.addMoneda(moneda, precioBebidas);
                return null;
            }
        }
        return null;
    }
    
    public Moneda getVuelto(){
        return MonVu.getMoneda();
    }
}
