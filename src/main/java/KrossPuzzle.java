import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class KrossPuzzle {
    private int size;
    int[][] grid;
    int startString=0;
    //String[] words;
    List<String> words = new ArrayList<String>();
    
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
                words.add(fileScan.next());
                System.out.println(words.get(index));
                index++;
              
            }
            fileScan.close();  
        } catch (IOException ioe) {
             String mess ="An exception was thrown while \nworking with the file: "+fNameWord;
            JOptionPane.showMessageDialog(null, mess,"error message",0);
        }
        System.err.println("word size: "+words.size());

       //boolean array of arrary to check if a character in the word was inserted
       
       boolean filledWord[][]= new boolean[words.size()][];
       for(int i = 0; i < words.size(); i++)
       {
           filledWord[i] = new boolean[words.get(i).length()];
           System.err.println(words.get(i).length());
           
       }
    //--test--prints 2D boolean array from above
    //    for(int i=0; i<filledWord.length;i++){
    //        for(int j= 0; j<(words.get(i).length());j++){
    //            System.out.print(filledWord[i][j]+" ");

    //        }
    //        System.out.print("\n");
    //    }

       solveKrossWord(grid,words,startString,filledWord);
        
     
    }
    
   private void solveKrossWord(int[][] grid, List<String> words, int dex, boolean filledWord[][]){
       
       String word = words.get(dex);
      
       
   }
     
    public int getGridPosition(int row, int col){
        return grid[row][col];
    }

    public int getSize(){
        return size;
    }
    
}
