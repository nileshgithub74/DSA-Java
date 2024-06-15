package ArrayList;
import java.util.*;

public class SmalllerElement {
    static  void smallerEle(int[] arr,int x){
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0; i <arr.length; i++){
            if( arr[i]< x){
                al.add(arr[i]);
            }


        }
        for(Integer t : al){
            System.out.print(t+" ");
        }











    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int x = 50;

        int[] arr = new int[size];
        System.out.println("Enter the element in the array: ");
        for(int i=0; i< size; i++){
            arr[i] = sc.nextInt();
        }

        smallerEle(arr,x);

    

        // for(int i=0; i< size; i++){
        //     if(arr[i] < x){
        //         System.out.print(arr[i]+" ");
        //     }
        // }





    }
    
}
