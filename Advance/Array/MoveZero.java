package Advance.Array;
import java.util.*;

public class MoveZero {

    static  void moveEnd(int[] arr){
        int count=0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] !=0){
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
                
            }
        }

    }


    public static void main(String[] args){
        int[]arr = {10, 8, 0, 0 ,12,0};
        System.out.println("Original array: ");


        System.out.print( Arrays.toString(arr));

        moveEnd(arr);
        System.out.println("Modified arrry: "+ Arrays.toString(arr));

        


        
    }
    
}
