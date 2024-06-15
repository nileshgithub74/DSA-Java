package ArrayList;
import java.util.*;


public class EvenOdd {

    static void getEvenOdd(int[] a){
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        for(int i=0;i< a.length; i++){
            if(a[i] % 2==0){
                al.add(a[i]);
            }else{
                al2.add(a[i]);
            }

        }

        System.out.println("Even element are: ");
        for( Integer x : al){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("Odd element are: ");
        for(Integer y : al2){
            System.out.print(y+" ");
        }









    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  size: ");
        int size= sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the element in the array : ");

        for(int i =0 ; i< size; i++){
            arr[i]= sc.nextInt();
        }

        getEvenOdd(arr);

    }
    
}
