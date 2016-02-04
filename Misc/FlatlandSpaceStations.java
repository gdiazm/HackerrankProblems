import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FlatlandSpaceStations {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int c[] = new int[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }
        int[] dist = new int[n];
        int j=0;
        for(int i=0; i<n; i++){
            dist[i]=(int)Math.pow(10,5);
        }
        for(int i=0; i<m; i++){
            dist[c[i]]=0;
        }
        
        for(int k=0; k<m; k++){
            int index = c[k];
            int l=0;
            while(index-l>=0||index+l<n){
                if(index-l>=0){
                    if(dist[index-l]>l){
                        dist[index-l]=l;
                    }
                }
                if(index+l<n){
                    if(dist[index+l]>l){
                        dist[index+l]=l;
                    }
                }
                l++;
            }
        }

        int max=0;
        for(int p=0; p<n; p++){
            if(dist[p]>max){
                max=dist[p];
            }
        }
        System.out.println(max);
    }
}
