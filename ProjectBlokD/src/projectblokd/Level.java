package projectblokd;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Level {
    Board board = new Board();
        
    public void makeLevel1(){
        
        ImageIcon img = new ImageIcon("Mario brick.png");
        JLabel imageLabel = new JLabel();
    
        int[][] maze = 
        {
            {1, 1, 1, 1, 1},
            {1, 0, 0, 0, 1}, 
            {1, 0, 1, 0, 1}, 
            {1, 0, 0, 0, 1}, 
            {1, 1, 1, 1, 1}
        };
        
        for(int y = 0; y < maze.length; y++){
            for(int x = 0; x < maze[0].length; x++) {
                if (maze[y][x] == 1){
                    imageLabel = new JLabel(img);
                }
            }
        }
        
        JFrame frame = new JFrame();
        frame.setSize(800, 800);
        frame.setTitle("Level 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        
        board = new Board();
        frame.add(board);
        frame.add(imageLabel);
        
        frame.setVisible(true);
        
    }
    
}
