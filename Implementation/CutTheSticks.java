import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CutTheSticks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        System.out.println(arr.length);
        boolean b=true;
        while(b){
            b=false;
            int min=1000;
            for(int i=0; i<arr.length; i++){
                if(arr[i]>0 && min>arr[i]){
                    min=arr[i];
                }
            }

            int count=0;

            for(int j=0; j<arr.length ; j++)
            {
                arr[j]=arr[j]-min;
                if(arr[j]>0){
                    count++;
                    b=true;
                }

            }
            if(count>0)
                System.out.println(count);
        }
    }
}
