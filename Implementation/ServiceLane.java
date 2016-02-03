import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ServiceLane {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int width[] = new int[n];
        for(int width_i=0; width_i < n; width_i++){
            width[width_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < t; a0++){
            int i = in.nextInt();
            int j = in.nextInt();
            int w=3;
            for(int k=i;k<=j;k++){
                
                if(width[k]==1)
                {
                    w=1;
                    break;
                }
                else if(width[k]==2)
                {
                    w=2;
                }
            }
            
            System.out.println(w);
            
        }
    }
}
