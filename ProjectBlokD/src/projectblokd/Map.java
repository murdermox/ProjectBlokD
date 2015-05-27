package projectblokd;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Map extends JPanel {

    
    private Player p = null;
    
    private String[][] maze = new String[][]{
        {"w", "w", "w", "w", "w", "w", "w", "w", "w", "w", "w", "w", "w"},
        {"w", "b", "w", "w", "x", "x", "x", "x", "w", "w", "w", "p", "w"},
        {"w", "x", "w", "w", "x", "w", "w", "x", "x", "x", "w", "x", "w"},
        {"w", "x", "w", "w", "x", "h", "w", "w", "w", "x", "w", "x", "w"},
        {"w", "x", "x", "x", "w", "w", "w", "x", "w", "x", "x", "x", "w"},
        {"w", "x", "w", "x", "x", "x", "x", "x", "x", "x", "w", "x", "w"},
        {"w", "x", "w", "w", "w", "w", "w", "w", "w", "x", "w", "x", "w"},
        {"w", "x", "w", "w", "x", "x", "x", "x", "w", "x", "w", "x", "w"},
        {"w", "x", "w", "w", "x", "w", "w", "x", "w", "x", "w", "x", "w"},
        {"w", "x", "x", "c", "x", "w", "w", "x", "w", "x", "w", "x", "w"},
        {"w", "x", "w", "w", "x", "w", "w", "x", "w", "x", "w", "x", "w"},
        {"w", "x", "x", "x", "x", "x", "w", "x", "w", "x", "x", "x", "w"},
        {"w", "w", "w", "w", "w", "w", "w", "w", "w", "w", "w", "w", "w"},};

    public Map() {

    }

    public void paintComponent(Graphics g) {

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 13; j++) {
                if (maze[j][i].equals("w")) {
                    g.setColor(Color.BLACK);
                    g.fillRect(i * 40, j * 40, 40, 40);
                    Wall w = new Wall();
                } else if (maze[j][i].equals("x")) {
                    g.setColor(Color.YELLOW);
                    g.fillRect(i * 40, j * 40, 40, 40);
                    Path x = new Path();
                } else if (maze[j][i].equals("h")) {
                    g.setColor(Color.BLUE);
                    g.fillRect(i * 40, j * 40, 40, 40);
                    Helper h = new Helper();
                } else if (maze[j][i].equals("b")) {
                    g.setColor(Color.CYAN);
                    g.fillRect(i * 40, j * 40, 40, 40);
                    Bazooka b = new Bazooka();
                } else if (maze[j][i].equals("p")) {
                    g.setColor(Color.PINK);
                    g.drawImage(null, i, j, this);
                    p = new Player(i, j);
                }
            }
        }
    }
    public Player getPlayer(){
        return p;
    }

}
