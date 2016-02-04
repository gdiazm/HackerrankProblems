import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MarsExploration {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int msg = s.length()/3;
        String sos ="SOS";
        String check;
        int count=0;
        for(int i=0; i<msg; i++){
            check=s.substring(3*i,(3*i)+3);
            if(!check.equals(sos)){
                for(int j=0; j<check.length(); j++){
                    if(check.charAt(j)!=sos.charAt(j)){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
