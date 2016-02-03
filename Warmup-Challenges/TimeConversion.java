import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String time = in.next();
        String hour=new String();
        String min=new String();
        String sec=new String();
        String info=new String();
        
        hour=time.substring(0,2);
        min=time.substring(3,5);
        sec=time.substring(6,8);
        info=time.substring(8,10);
        
        int h=Integer.parseInt(hour);
        int m=Integer.parseInt(min);
        int s=Integer.parseInt(sec);
        
        if(h==12)
        {
           if(info.equals("AM"))
           {
               h-=12;
               hour="0"+String.valueOf(h);
           }
        }
        else if(info.equals("PM"))
        {   
            h+=12;
            hour=String.valueOf(h);
        }
        
        System.out.println(hour+":"+min+":"+sec);
    }
}
