import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExtraLongFactorials {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger res = new BigInteger("1");

        for(int i=1; i<=n; i++){
            res=res.multiply(BigInteger.valueOf(i));
        }
        System.out.println(res);
    }
}
