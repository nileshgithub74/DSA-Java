
import java.util.*;
public class MissingElement {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element in array:");

        int[] arr = new int[15];
        for(int i =0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Array is: ");
        for(int x: arr){
            System.out.print(x+" ");
        }

        int sum = 0; 
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        int a= arr[10];
         int s=  a*(a+1)/2;
         int missElement  = s- sum;
         System.out.println("Sum: "+sum);
         System.out.println("missElement :" +missElement);


    }
    
}
