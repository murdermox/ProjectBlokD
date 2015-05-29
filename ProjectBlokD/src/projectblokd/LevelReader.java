package projectblokd;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

public class LevelReader extends JPanel {

    Speler p;

    private Object[][] object = new Object[][]{};
    ImageLoader wall;
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

    public void readMap() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("src\\resources\\textfiles\\level1.txt"));

        while (scanner.hasNextLine()) {
            for (int i = 0; i < maze.length; i++) {
                for (int j = 0; j < maze.length; j++) {
                    maze[j][i] = scanner.next();
                }
            }
        }
    }

    public void paintComponent(Graphics g) {

        /*
         try {
         readMap();
         } catch (FileNotFoundException ex) {
         System.out.println(ex);
         }*/
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                if (maze[j][i].equals("w")) {
                    g.setColor(Color.BLACK);
                    try {
                        g.drawImage(wall.setWallImage(), j, i, this);
                        //g.fillRect(i * 40, j * 40, 40, 40);
                        //Muur w = new Muur();
                        //object[j][i] = w;
                    } catch (IOException ex) {
                        System.out.println(ex);
                    }
                } else if (maze[j][i].equals("x")) {
                    g.setColor(Color.YELLOW);
                    g.fillRect(i * 40, j * 40, 40, 40);
                    //Pad x = new Pad();
                    //object[j][i] = x;
                } else if (maze[j][i].equals("h")) {
                    g.setColor(Color.BLUE);
                    g.fillRect(i * 40, j * 40, 40, 40);
                    //Helper h = new Helper();
                    //object[j][i] = h;
                } else if (maze[j][i].equals("b")) {
                    g.setColor(Color.CYAN);
                    g.fillRect(i * 40, j * 40, 40, 40);
                    //Bazooka b = new Bazooka();
                    //object[j][i] = b;
                } else if (maze[j][i].equals("p")) {
                    g.setColor(Color.GREEN);
                    g.drawImage(null, i, j, this);
                    //p = new Speler(i, j);
                    // object[j][i] = p;
                }
            }
        }
    }

    public Speler getPlayer() {
        return p;
    }

}
