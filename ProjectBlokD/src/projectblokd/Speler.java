package projectblokd;

import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

public class Speler {

    public int x;
    public int y;
    private BufferedImage wall;
    String type;

    public Speler(int xco, int yco) {
        x = xco;
        y = yco;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int setX(int xco) {
        return x = xco;
    }

    public int setY(int yco) {
        return y = yco;
    }

    public boolean checkItem() {

        return true;
    }

    public void pakItem() {

    }

    public void gebruikItem() {

    }

    public boolean checkVriend() {

        return true;
    }

}
