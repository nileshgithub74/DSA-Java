import java.util.*;

public class Insertion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size+1 ]; 
        int length = size;

        System.out.println("Enter the element in the array: ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Element in the arrray is : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("Enter the element we want to insert: ");
        int element = sc.nextInt();
        System.out.println("Enter the index: ");
        int index = sc.nextInt();

        if (index < size  || index>0) {
            for (int i = size ; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = element;
            length++;

        } else {
            System.out.println("not able to insert");
        }

        System.out.println("New array is: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + "   ");
        }

    }

}

