package projectblokd;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Veld extends JPanel{

    
    public static Player p = new Player(11, 1);
    private Wall w = new Wall();
    private Helper h = new Helper();
    private Cheater c = new Cheater();
    private Bazooka b = new Bazooka();
    private Path x = new Path();
    private SpecialWall s = new SpecialWall();
    private Object[][] maze = new Object[][]{
        {s, s, s, s, s, s, s, s, s, s, s, s, s},
        {s, b, w, w, x, x, x, x, w, w, w, p, s},
        {s, x, w, w, x, w, w, x, x, x, w, x, s},
        {s, x, w, w, x, h, w, w, w, x, w, x, s},
        {s, x, x, x, w, w, w, x, w, x, x, x, s},
        {s, x, w, x, x, x, x, x, x, x, w, x, s},
        {s, x, w, w, w, w, w, w, w, x, w, x, s},
        {s, x, w, w, x, x, x, x, w, x, w, x, s},
        {s, x, w, w, x, w, w, x, w, x, w, x, s},
        {s, x, x, c, x, w, w, x, w, x, w, x, s},
        {s, x, w, w, x, w, w, x, w, x, w, x, s},
        {s, x, x, x, x, x, w, x, w, x, x, x, s},
        {s, s, s, s, s, s, s, x, s, s, s, s, s},};

    public Veld() {

        
    }

    public void paintComponent(Graphics g) {

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 13; j++) {
                if (maze[j][i].equals(w)) {
                    g.setColor(Color.BLACK);
                    g.fillRect(i * 40, j * 40, 40, 40);
                } else if (maze[j][i].equals(x)) {
                    g.setColor(Color.YELLOW);
                    g.fillRect(i * 40, j * 40, 40, 40);
                } else if (maze[j][i].equals(s)) {
                    g.setColor(Color.BLACK);
                    g.fillRect(i * 40, j * 40, 40, 40);
                } else if (maze[j][i].equals(h)) {
                    g.setColor(Color.BLUE);
                    g.fillRect(i * 40, j * 40, 40, 40);
                } else if (maze[j][i].equals(b)) {
                    g.setColor(Color.CYAN);
                    g.fillRect(i * 40, j * 40, 40, 40);
                } else if (maze[j][i].equals(p)) {
                    g.setColor(Color.PINK);
                    g.fillRect(i * 40, j * 40, 40, 40);
                }
            }
        }
    }

}
