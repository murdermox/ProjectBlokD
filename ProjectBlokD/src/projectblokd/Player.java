package projectblokd;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Player {

    public int x;
    public int y;
    
    
    
    public Player(int xco , int yco){
        x = xco;
        y = yco;
    }
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int setX(int xco){
        return x = xco;
    }
    public int setY(int yco){
        return y = yco;
    }

}
