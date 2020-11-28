import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KrossDisplay extends JPanel{
    KrossPuzzle puzzle;
    int cellSize = 50;
    int start_x = 50;
    int start_y=50;
    int offset_x=15;
    int offset_y=35;
    Font numberFont = new Font("Arial",1,30);
    Color digitColor = Color.blue;
    
    public KrossDisplay(KrossPuzzle puz)
    {
        puzzle = puz;
       
    }
    
     public void paintComponent(Graphics g)
    {
        g.setFont(numberFont);
        for (int row = 0; row < puzzle.getSize(); row++) {
            for (int col = 0; col < puzzle.getSize(); col++) {
                g.drawRect(start_x + col*cellSize, start_y + row*cellSize, cellSize, cellSize);

                if (puzzle.getGridPosition(row,col)>0) 
                {
                   g.setColor(digitColor);
                    g.drawString("X", start_x+col*cellSize+offset_x, start_y+row*cellSize+offset_y);
                    g.setColor(Color.black);
                } 
                else{
                    
                }
                
            }
            
        }
        
    }
    
}

