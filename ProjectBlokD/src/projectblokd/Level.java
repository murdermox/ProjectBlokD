package projectblokd;

import javax.swing.*;
import java.awt.Color;

public class Level extends JFrame {

    private Veld b = new Veld();

    public Level() {
        createComponents();
    }

    public void createComponents() {

        setSize(560, 560);
        setTitle("Maze Game");
        setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(b);
        setResizable(false);
        setVisible(true);

    }

}
