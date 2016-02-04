import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BinaryNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int t = in.nextInt();
        
        for(int i=0; i<t; i++){
            int n = in.nextInt();
            int res=n, rem;
            StringBuilder total= new StringBuilder();
            while(res!=0){
                rem=res%2;
                res=res/2;
                total.append(rem);
            }
            
            System.out.println(total.reverse().toString());
        }
    }
}
