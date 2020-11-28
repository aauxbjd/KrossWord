import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class KrossPuzzle {
    private int size;
    int[][] grid;
    String[] words = new String[100];
    
    public KrossPuzzle(String fName, String fNameWord){
        loadPuzzleFromFile(fName);
        loadWordsFromFile(fNameWord);
    }

    private void loadPuzzleFromFile(String fName) {
       File inFile = new File(fName);
        try {
            Scanner fileScan = new Scanner(inFile);
            size = fileScan.nextInt();
            grid = new int[size][size];
            
            for (int row = 0; row < size; row++) {
                for (int col = 0; col < size; col++) {
                    grid[row][col]=fileScan.nextInt();
                    System.out.print(" "+grid[row][col]);   
                }
                System.out.print("\n"); 
                
            }
            fileScan.close();  
            
        } catch (IOException ioe) {
             String mess ="An exception was thrown while \nworking with the file: "+fName;
            JOptionPane.showMessageDialog(null, mess,"error message",0);
        }
        
       
    }
    
    private void loadWordsFromFile(String fNameWord) {
        int index=0;
        
        File inFile = new File(fNameWord);
        
        try {
            Scanner fileScan = new Scanner(inFile);
            while (fileScan.hasNext()) 
            {
                words[index] = fileScan.next();
                System.out.println(words[index]);
                index++;
              
            }
            fileScan.close();  
        } catch (IOException ioe) {
             String mess ="An exception was thrown while \nworking with the file: "+fNameWord;
            JOptionPane.showMessageDialog(null, mess,"error message",0);
        }
        
     
    }
    
//    private void solution(int[][] grid, String[] words, int dex){
//        
//        String word = words[dex];
//        for (int row = 0; row < grid.length; row++) {
//            for (int col = 0; col < grid.length; col++) {
//                if (grid[row][col] == -1 || grid[row][col] == ) {
//                    
//                }
//                
//            }
//            
//        }
//        
//    }
     
    public int getGridPosition(int row, int col){
        return grid[row][col];
    }

    public int getSize(){
        return size;
    }
    
}
