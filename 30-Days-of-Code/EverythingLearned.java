import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EverythingLearned {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int T = in.nextInt();
        for(int i=0; i<T; i++){
            String s = in.next();
            char[] c = s.toCharArray();
            int size = c.length;
            boolean funny=true;
            for(int j=0; j<size-1; j++){
                int a=Math.abs((int)c[j+1]-(int)c[j]);
                int b=Math.abs((int)c[size-j-2]-(int)c[size-j-1]);
                if(a!=b){
                    funny=false;
                    break;
                }
            }
            
            String sol=funny?"Funny":"Not Funny";
            System.out.println(sol);
        }
    }
}
