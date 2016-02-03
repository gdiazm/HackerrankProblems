import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ChocolateFeast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int count=0;
        int wrapper=0;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            count=n/c;
            wrapper=count;
            while(wrapper>=m){
                wrapper-=m;
                count++;
                wrapper++;
            }
            
            System.out.println(count);
        }
    }
}
