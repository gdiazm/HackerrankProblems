import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TaumAndBday {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int b = in.nextInt();
            int w = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            
            BigInteger total=new BigInteger("0");
            if(x<=(y+z)){
                total=total.add(BigInteger.valueOf(x).multiply(BigInteger.valueOf(b)));                
            }else{
                int sum=y+z;
                total=total.add(BigInteger.valueOf(sum).multiply(BigInteger.valueOf(b)));
            }
            
            if(y<=(x+z)){
                total=total.add(BigInteger.valueOf(y).multiply(BigInteger.valueOf(w)));
            }else{
                int sum=x+z;
                total=total.add(BigInteger.valueOf(sum).multiply(BigInteger.valueOf(w)));
            }
            
            System.out.println(total);
        }
    }
}
