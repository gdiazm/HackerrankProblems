import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TheTimeInWords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();

        String[] numbers= {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine",};
    
        String minutes= new String("minutes");
        if(m==0||m==15||m==30||m==45){
            switch (m) {
            case 0: System.out.println(numbers[h-1]+" o' clock");
                    break;
                
            case 15: System.out.println("quarter past " + numbers[h-1]);
                     break;
                
            case 30: System.out.println("half past " + numbers[h-1]);
                     break;
                
            case 45: System.out.println("quarter to " + numbers[h]);
                     break;
            }
        }else{
            if(m<30){
                if(m==1){
                    minutes.substring(0,minutes.length()-1);
                }
                System.out.println(numbers[m-1]+" "+ minutes+ " past " + numbers[h-1]);
            }else{
                if(m==59){
                   minutes.substring(0,minutes.length()-1); 
                }
                System.out.println(numbers[60-m-1]+ " "+ minutes+ " to " + numbers[h]);
            }
        }
        
        
        
    }
}
