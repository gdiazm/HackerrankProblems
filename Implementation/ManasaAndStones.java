import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ManasaAndStones {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int t = in.nextInt();
        for(int i=0; i<t; i++){
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            if(a>b){
                int aux=b;
                b=a;
                a=aux;
            }
            if(a==b){
                int res=a*(n-1);
                System.out.print(res);
            }
            else{
                for(int j=0; j<n; j++){
                    int res=j*b+(n-1-j)*a;
                    System.out.print(res+" ");
                }
            }
            System.out.print("\n");
        }
    }
}
