import java.util.*;
public class Deletion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
         int size = sc.nextInt();

         int a[] = new int[size];
         int b[] = new int[size-1];
         System.out.println("Enter the element: ");
         for(int i=0; i<a.length; i++){
             a[i] = sc.nextInt();
            }
        
            System.out.println("A array is ");
            for(int i=0; i<a.length; i++){
                System.out.print(a[i]+" ");
            }

            System.out.println("Enter the index we want to deleted");
            int index = sc.nextInt();


            for(int i=0; i<a.length; i++){
                if(i< index){
                    b[i] = a[i];
                }else if (i==index){
                    continue;
                }else{
                    b[i-1] =a[i];
                }
            }


            System.out.println("Updated array is: ");
            for(int i=0; i<size -1; i++){
                System.out.println(b[i]);
            }

            sc.close();



        

        


    }
    
}
