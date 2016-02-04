import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArraysAndReview {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
            int total=-70;
            for(int k=0; k<4; k++){
                for(int l=0; l<4; l++){
                    int sum=arr[k][l]+arr[k][l+1]+arr[k][l+2]+arr[k+1][l+1]+arr[k+2][l]+arr[k+2][l+1]+arr[k+2][l+2];
                    if(sum>total){
                        total=sum;
                    }
                }
            }
        System.out.println(total);
    }
}
