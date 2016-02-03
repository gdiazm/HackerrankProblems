import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CaesarCipher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        int length=s.length();
        StringBuilder sb= new StringBuilder();
        int a=0;
        char[] c=s.toCharArray();
        for(int i=0;i<length;i++){
            a=(int)c[i];
            if(a>=65&&a<=90){
                a+=k;
                while(a>90){
                    a=64+(a-90);
                }
            }
            else if (a>=97&&a<=122){
                a+=k;
                while(a>122){
                    a=96+(a-122);
                }
            }
            sb.append((char)a);
        }
        System.out.println(sb);
    }
}
