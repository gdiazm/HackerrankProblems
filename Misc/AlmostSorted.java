import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlmostSorted {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        int[] arr= new int[n];
        int[] orgArr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=in.nextInt();
            orgArr[i]=arr[i];
        }
        //Insertion sort
        for(int j=0; j<n; j++){
                int count=0;
                int index=j-1;
                while(index>=0&&arr[j]<arr[index]){
                    count++;
                    index--;
                }
                if(count>0){
                    int finalIndex=j-count;
                    int aux=arr[j];
                    for(int k=j; k>finalIndex; k--){
                        arr[k]=arr[k-1];
                    }
                    arr[finalIndex]=aux;
                }
        }
        
        //Comparing original array with sorted one
        LinkedList queue = new LinkedList();
        Stack stack= new Stack();
        
        for(int i=0; i<n; i++){
                queue.push(arr[i]);
                stack.push(orgArr[i]);
        }

        ArrayList<Integer> list= new ArrayList<Integer>();
        for(int i=n; i>0; i--){
            Integer I1=(Integer)queue.pop();
            Integer I2= (Integer)stack.pop();
            if(I1.intValue()!=I2.intValue()){
                list.add(i);
            }
        }

        int size= list.size();
        int[] index = new int[size];
        int[] cpy= new int[size];
        Iterator it= list.iterator();
        for(int i=size-1; i>=0; i--){
            index[i]=((Integer)it.next()).intValue();
            cpy[i]=index[i];
        }
        if(size==2){
            System.out.println("yes");
            System.out.println("swap "+ index[0] +" "+index[1]);
        }else{
            //Reversing
            for(int i=0; i<size/2; i++){
                int temp=index[size-i-1];
                index[size-i-1]=index[i];
                index[i]=temp;
            }
            boolean b=false;
            for(int i=0; i<size; i++){
                if(orgArr[index[i]-1]!=arr[cpy[i]-1]){
                    b=true;
                    break;
                }
            }
            if(b){
                System.out.println("no");
            }else{
                System.out.println("yes");
                System.out.println("reverse "+cpy[0]+" "+cpy[size-1]);
            }
        }
        
    }
}
