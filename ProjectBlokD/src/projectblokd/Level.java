package projectblokd;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Level extends JFrame {

    private LevelReader m = new LevelReader();

    public Level() {
        createComponents();
    }

    public void createComponents() {

        setSize(560, 560);
        setTitle("Maze Game");
        //setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        m.addKeyListener(new PlayerListener());
        m.setFocusable(true);
        add(m);
        setResizable(false);
        setVisible(true);

    }

    class PlayerListener implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
        }
        
        @Override
        public void keyReleased(KeyEvent e) {
            Speler p = m.getPlayer();
            int x = p.getX();
            int y = p.getY();
            System.out.print("old:("+x+","+y+") ");
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
            p.setX(x);
            p.setY(y);
            System.out.println("new: ("+p.getX()+","+p.getY()+") ");
            
        }

        
    }
}
