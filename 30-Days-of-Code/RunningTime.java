import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RunningTime {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int T = in.nextInt();
        
        for(int i=0; i<T ; i++){
            int x = in.nextInt();
            boolean b=false;
            int limit=(int)Math.sqrt(x);
            if(x!=1){
                for(int k=2; k<=limit; k++){
                    if(x%k==0){
                        b=true;
                        break;
                    }
                } 
            }else{
                b=true;
            }
            if(b){
                System.out.println("Not prime");
            }else{
                System.out.println("Prime");
            }
        }
    }
}
