import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Loops {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int t= in.nextInt();
        for(int i=0;i<t; i++){
            int a=in.nextInt();
            int b=in.nextInt();
            int N=in.nextInt();
            int result=a;
            for(int j=0;j<N;j++){
                result+=(b*Math.pow(2,j));
                System.out.print(result+" ");
            }
            System.out.print("\n");
        }
    }
}
