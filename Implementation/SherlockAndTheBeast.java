import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndTheBeast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        StringBuilder result;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            result = new StringBuilder();
            if(n==1||n==2||n==4||n==7)
            {
                result.append("-1");
            }
            else
            {
                if(n%3==0)
                {
                    for(int i=0;i<n;i++)
                    {
                        result.append("5");
                    }
                }
                else
                {
                    int fives=0;// number of fives
                    int threes=0;// number of threes
                    int aux=n;
                    
                    while(aux%3!=0)
                    {
                        aux-=5;
                        threes++;
                    }
                    
                    fives=aux/3;
                    
                    fives*=3;
                    threes*=5;
                          
                    for(int j=0; j<fives; j++)
                    {
                        result.append("5");
                    }
                    
                    for(int i=0; i<threes; i++)
                    {
                        result.append("3");
                    }
                }
            }
            
            System.out.println(result);
        }
    }
}
