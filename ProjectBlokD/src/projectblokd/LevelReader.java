package projectblokd;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.*;

public class LevelReader extends JPanel {

    
    private Speler p = null;
    
    private Object[][] object = new Object[][]{};
    private String[][] maze = new String[][]{};
    private ImageIcon image;
    private JLabel label;
    private JFrame frame = new JFrame();

    public LevelReader() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(10,10));
        try {
            Scanner in = new Scanner(new File("src/resources/txt/Level.txt").getAbsoluteFile());
            
            
            for (int i = 0; i < 10; i++) {
            
                char[] txt;
                String s1 = in.nextLine();
                txt = s1.toCharArray();

                for (int j = 0; j < 10; j++) {

                    char c = txt[j];
                    if(c == 'm'){
                        image = new ImageIcon(getClass().getResource("src/resources/images/brickwall.png"));
                        label = new JLabel(image);
                        p.add(label);
                    }
                    if(c == 's'){
                        image = new ImageIcon(getClass().getResource("src/resources/images/Mario.png"));
                        label = new JLabel(image);
                        p.add(label);
                    }
                    if(c == 'v'){
                        image = new ImageIcon(getClass().getResource("src/resources/images/Grass.png"));
                        label = new JLabel(image);
                        p.add(label);
                    }
                }
                
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(p);
        frame.setVisible(true);
        frame.pack();
    }

    public Speler getPlayer(){
        return p;
    }

}
