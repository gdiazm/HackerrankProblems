import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] m= new int [N][N];
        int d1=0;
        int d2=0;
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<N ; j++)
            {
               m[i][j]=in.nextInt();
               if(i==j)
               {
                   d1=d1+m[i][j];
               }                
               if(i+j==N-1)
               {
                   d2=d2+m[i][j];
               }
            }
        }
        
        System.out.println(Math.abs(d1-d2));
    }
}
