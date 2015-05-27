package projectblokd;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player extends Veld implements KeyListener {

    public int x;
    public int y;
    
    public Player (int xco, int yco){
        x = xco;
        y = yco;
    }
    
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                y -= 1;
                break;
            case KeyEvent.VK_RIGHT:
                x += 1;
                break;
            case KeyEvent.VK_LEFT:
                x -= 1;
                break;
            case KeyEvent.VK_DOWN:
                y += 1;
                break;
        }

    }

}
