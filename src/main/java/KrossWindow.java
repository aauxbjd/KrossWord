import javax.swing.*;

public class KrossWindow extends JFrame{
    int win_wid = 600;
    int win_hei = 600;
    
    KrossDisplay display;
    KrossPuzzle  puzzle;
    //
    
    public KrossWindow(String fileName, String fileNameWord)
    {
        this.setTitle("Kross puzzle: "+fileName);
        this.setSize(win_wid, win_hei);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        KrossPuzzle puzzle = new KrossPuzzle(fileName, fileNameWord);
        KrossDisplay display = new KrossDisplay(puzzle);
        this.add(display);
        this.setVisible(true);
        
    }
    public static void main(String[] args) {
        KrossWindow myWin = new KrossWindow("4X4_easy.txt","words.txt");
        
    }
    
}
