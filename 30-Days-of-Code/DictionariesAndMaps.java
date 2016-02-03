import java.util.*;
import java.io.*;

class DictionariesAndMaps{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      int N=in.nextInt();
      in.nextLine();
      Map <String, Integer> phoneBook= new HashMap<String, Integer>();
      for(int i=0;i<N;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         phoneBook.put(name,phone);
         in.nextLine();
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
         if(phoneBook.containsKey(s)){
             int phone=phoneBook.get(s);
             System.out.println(s+"="+phone); 
         }else{
             System.out.println("Not found"); 
         }
         
      }
   }
}
