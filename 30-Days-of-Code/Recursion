import java.io.*;
import java.util.*;
public class Recursion {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int gcd=find_gcd(a,b);
        System.out.println(gcd);
    }
   static  int find_gcd(int a,int b){
          int max,min;
          if(a==b){
              return a;
          }else{
              if(a>b){
                  max=a;
                  min=b;
              }else{
                  max=b;
                  min=a; 
              }
              return(find_gcd(max-min,min));
          }
      }
}
