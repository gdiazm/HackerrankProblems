import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SimpleArraySum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int sum=0;
        for(int i=0;i<N;i++)
        {
            sum=sum+in.nextInt();
        }
        System.out.println(sum);
    }
}
