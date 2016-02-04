    
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Review {

    public static void main(String[] args) {
       Scanner in= new Scanner (System.in);
       String input = in.nextLine();
       StringTokenizer sc = new StringTokenizer(input," \\![,?.'_''@+]");
       System.out.println(sc.countTokens());
       while (sc.hasMoreTokens()){
           System.out.println(sc.nextToken());
       }
    }
}
