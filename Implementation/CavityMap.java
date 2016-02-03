import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CavityMap {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[][] matrix= new char[n][n];
        String grid[] = new String[n];
        for(int i=0; i < n; i++){
            grid[i] = in.next();
            for(int j=0;j<n;j++){
                matrix[i][j]=grid[i].charAt(j);
            }
        }
        
        for(int i=1; i<n-1 ;i++){
            for(int j=1; j<n-1 ;j++){
                       if(Character.getNumericValue(matrix[i][j])>Character.getNumericValue(matrix[i-1][j])){
                           if(Character.getNumericValue(matrix[i][j])>Character.getNumericValue(matrix[i][j-1])){
                               if(Character.getNumericValue(matrix[i][j])>Character.getNumericValue(matrix[i][j+1])){
                                   if(Character.getNumericValue(matrix[i][j])>Character.getNumericValue(matrix[i+1][j])){
                                      matrix[i][j]='X'; 
                                   }
                              }
                           }
                       }
            }    
        }                  

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]);   
            }
            System.out.print("\n");
        }
    }
}   
