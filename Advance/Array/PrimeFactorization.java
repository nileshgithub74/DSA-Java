package Advance.Array;
import java.util.*;
public class PrimeFactorization {
    static void primefactor(int n){
    
        for(int i=2; i*i <=n ; i++){

            
            while(n % i ==0){
               System.out.print(i+" ");
               n = n/i;
               
            }
        }
        if(n> 1){
            System.out.print(n);
        }
        
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Prime factoriztion of number is: ");

        primefactor(n);



    }
    
}
