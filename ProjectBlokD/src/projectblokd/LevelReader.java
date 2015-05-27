package projectblokd;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LevelReader extends JPanel {

    
    private Speler p = null;
    
    private Object[][] object = new Object[][]{};
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

    public LevelReader() {

    }

    public void paintComponent(Graphics g) {

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 13; j++) {
                if (maze[j][i].equals("w")) {
                    g.setColor(Color.BLACK);
                    g.fillRect(i * 40, j * 40, 40, 40);
                    Muur w = new Muur();
                    object[j][i] = w;
                } else if (maze[j][i].equals("x")) {
                    g.setColor(Color.YELLOW);
                    g.fillRect(i * 40, j * 40, 40, 40);
                    Pad x = new Pad();
                    object[j][i] = x;
                } else if (maze[j][i].equals("h")) {
                    g.setColor(Color.BLUE);
                    g.fillRect(i * 40, j * 40, 40, 40);
                    Helper h = new Helper();
                    object[j][i] = h;
                } else if (maze[j][i].equals("b")) {
                    g.setColor(Color.CYAN);
                    g.fillRect(i * 40, j * 40, 40, 40);
                    Bazooka b = new Bazooka();
                    object[j][i] = b;
                } else if (maze[j][i].equals("p")) {
                    g.setColor(Color.PINK);
                    g.drawImage(null, i, j, this);
                    p = new Speler(i, j);
                    object[j][i] = p;
                }
            }
        }
    }
    public Speler getPlayer(){
        return p;
    }

}
