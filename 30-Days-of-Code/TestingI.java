import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TestingI {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        int fine=0;
        if(y2<y1){
            fine=10000;
        }else if(y2==y1){
            if(m2<m1){
                fine=500*(m1-m2);
            }
            else if(m2==m1){
                if(d2<d1){
                    fine=15*(d1-d2);
                }
            }
        }
        System.out.println(fine);
    }
}
