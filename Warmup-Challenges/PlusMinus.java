import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int pos=0, neg=0, zero=0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]<0){
                neg++;
            }else if(arr[arr_i]==0){
                zero++;
            }else{
                pos++;
            }
        }
         System.out.println((float)pos/n);
         System.out.println((float)neg/n);
         System.out.println((float)zero/n);
    }     
}
