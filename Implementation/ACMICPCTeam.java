import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ACMICPCTeam {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] matrix= new int[n][m];
        String topic[] = new String[n];
        for(int topic_i=0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
            for(int j=0;j<m;j++){
                matrix[topic_i][j]=Integer.parseInt(topic[topic_i].substring(j,j+1));
            }
        }
        
        int limit=(n)*(n-1)*1/2;
       
        int[] count= new int [limit];
        for(int i=0;i<count.length;i++){
            count[i]=0;
        }
        
        int index=0;
        for(int i=0; i<limit; i++){
            for(int j=i+1; j<n; j++){
                for(int k=0; k<m; k++){
                    if(matrix[i][k]+matrix[j][k]>0){
                        count[index]++; 
                    }
                }
                index++;
            }
        }
        int max=-1;
        int total=0;
        
        for(int i=0;i<count.length;i++){
            if(count[i]>max){
                max=count[i];
                total=1;
            }else if(count[i]==max){
                total++;
            }
        }   
        System.out.println(max);
        System.out.println(total);
    }
}
