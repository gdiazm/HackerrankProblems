import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            String s= new String(String.valueOf(n));
            int size=s.length();
            int digit=0,count=0;
            
            for(int i=0;i<size;i++)
            {
                digit=Integer.parseInt(s.substring(i,i+1));
                if(digit!=0 && n%digit==0)
                {
                    count++;
                }
            }
            
            System.out.println(count);
        }
    }
}
