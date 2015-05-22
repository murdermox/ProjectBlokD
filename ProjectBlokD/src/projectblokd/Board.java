package projectblokd;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Board extends JPanel implements ActionListener {
    
        
    
    public Board(){
        
    }
    
    public void actionPerformed(ActionEvent e){
        repaint();
    }
    
    public void paint(Graphics g){
        super.paint(g);
    }
    
}
