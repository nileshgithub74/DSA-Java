import java.util.*;



public class SortedArray {

    // public static boolean isSorted(int[] arr){
    //     for(int i=0; i<arr.length; i++){
    //         for(int j=i+1; j<arr.length; j++){
    //             if(arr[j] < arr[i] )
    //                 return false;
    //         }
            
    //     }
    //     return true;
    // }


    public static boolean isSorted(int[] arr){

        for(int i=1; i<arr.length; i++){
            if(arr[i-1] > arr[i]){
                return false;
            }  
           
        }
        return true;
        
    }

    public static void main(String[] args){
        int arr[] = { 10, 39,54,55,56,635};
        System.out.println(isSorted(arr));
    }




    
}
