package expendedor2d;

import java.awt.*;

abstract public class Bebida {
    private int numSerie;
    private int x, y;
    
    
    public Bebida(int numSerie, int x, int y){
        this.x = x; this.y = y;
        this.numSerie = numSerie;
    }
    public int getSerie(){
        return this.numSerie;
    }
    public abstract String beber();

    public void paint(Graphics g) {
        g.setColor();
        g.drawRect(x, y, 27, 40);
        g.drawString(""+numSerie, x+ancho/7, y+largo);
    }
    public void setXY(int x, int y){        
        this.x = x; this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    
    
}

class Sprite extends Bebida{
    
    public Sprite(int numSerie, int x, int y){
        super(numSerie, x, y,GREEN);
    }
    @Override
    public String beber(){
        return "Sprite";
    }
}

class CocaCola extends Bebida{
    
    public CocaCola(int numSerie, int x, int y){
        super(numSerie, x, y,RED);
    }
    @Override
    public String beber(){
        return "CocaCola";
    }
}
class Fanta extends Bebida{
    
    public Fanta(int numSerie, int x, int y){
        super(numSerie, x, y,ORANGE);
    }
    @Override
    public String beber(){
        return "Fanta";
    }
}
