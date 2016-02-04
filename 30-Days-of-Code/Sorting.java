import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sorting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }

        //Insertion sort
        for(int j=0; j<N; j++){
                int count=0;
                int index=j-1;
                while(index>=0&&arr[j]<arr[index]){
                    count++;
                    index--;
                }
                if(count>0){
                    int finalIndex=j-count;
                    int aux=arr[j];
                    for(int k=j; k>finalIndex; k--){
                        arr[k]=arr[k-1];
                    }
                    arr[finalIndex]=aux;
                }
            }
        
        //Find min difference
        StringBuilder sb = new StringBuilder();
        int dif=2*((int)Math.pow(10,5))-2;
        for(int l=0 ;l<N-1; l++){
            if(Math.abs(arr[l]-arr[l+1])<dif){
                dif=Math.abs(arr[l]-arr[l+1]);
                sb.setLength(0);
                sb.append(arr[l]+" "+arr[l+1]+" ");
            }else{
                if(Math.abs(arr[l]-arr[l+1])==dif){
                    sb.append(arr[l]+" "+arr[l+1]+" ");
                }
            }
        }
        System.out.println(sb); 
    }
}
