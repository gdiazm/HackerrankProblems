import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char chars[][]= new char[n][n];
        for (int i=0; i<n; i++)
        {
            for(int j=n-i-1;j<n;j++)
            {
                chars[i][j]='#';
            }
            for(int k=0;k<n-i-1;k++)
            {
                chars[i][k]=' ';
            }
        }
        
        for(int a=0;a<n;a++)
        {    
                System.out.println(chars[a]);
        }    
    }
}
