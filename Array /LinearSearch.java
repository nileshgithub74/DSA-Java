// // public class LinearSearch {
// //     public static int linearSearch(int[] arr, int x) {
// //         for (int i = 0; i < arr.length; i++) {
// //             if (arr[i] == x) {
// //                 return i;
// //             }
// //         }
// //         return -1;
// //     }

// //     public static void main(String[] args) {
// //         int[] arr = {2, 3, 4, 10, 40};
// //         int x = 10;
// //         int result = linearSearch(arr, x);
// //         if (result != -1) {
// //             System.out.println("Element found at index " + result);
// //         } else {
// //             System.out.println("Element not found");
// //         }
// //     }
// // }


// public class LinearSearch{
//     public static int Search(int arr[] , int n){
//         for(int i =0; i<arr.length; i++){
//             if(arr[i] == n){
//                 return  i;
//             }
//         }
//         return -1;

//     }

//     public static void main(String[] args){
//         int arr[] = {1,2,3,4,5,5,6,7,8};
//         int n = 5;

//         int result = Search(arr , n);
//         if(result != -1){
//             System.out.println("Element found at index "+  result);

//         }else{
//             System.out.println("Not found");
//         }


//     }
// }

import java.util.*;
public  class LinearSearch{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int i=0;

        System.out.println("enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new  int[size];
        System.out.println("Enter the element in the array: ");
        for( i =0; i<arr.length; i++){
            arr[i] =sc.nextInt();

        }
        System.out.println("Element are : ");
        for( i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");

        System.out.println("Enter the element you want to search: ");
        int num = sc.nextInt();
        boolean found = false;
        
        for( i=0; i<arr.length; i++){
            if(arr[i] == num){
                System.out.println("Element found at index "+ i);
                found = true;
                break;
            }
          
            
         
        }
        if(!found){
            System.out.println("Not found");
        }

        
        





    }
}