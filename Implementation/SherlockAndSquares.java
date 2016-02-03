import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;

public class SherlockAndSquares {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int testCases= sc.nextInt();
        int limits[]= new int[2];
        
        for(int i=0; i<testCases; i++)
        {
            limits[0]=sc.nextInt();
            limits[1]=sc.nextInt();
            int a= limits[0];
            int b= limits[1];
            
            int result=0;
            int n=0;
            int k=0;
            
            boolean bo=false;
            int j=a;
            
            while(j<=b)
            {           
                if(Math.sqrt(j)==Math.floor(Math.sqrt(j)))
                {
                    n=(int)Math.sqrt(j);
                    k=j;
                    while(k<=b)
                    {
                        k+=2*n+1;
                        if(Math.sqrt(k)==Math.floor(Math.sqrt(k)))
                        {
                            result ++;
                        }
                        n++;
                    }
                   bo=true;        
                }
                   if(bo)
                   {
                      break;
                   }
                   j++; 
            }
            System.out.println(result);
        }
    }
}
