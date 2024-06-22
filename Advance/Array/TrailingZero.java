package Advance.Array;
import java.util.*;
public class TrailingZero {

    static int  findFactorial(int n){
        int fact =1;
        if(n<1){
            fact  =1;
        }
        for(int i=1;i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }

     static int trailingZeroFinder(int n){
        int result =0;
        for(int i=5; i<=n; i=i*5){
            result = result + n/i;
        }
        return result;
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("The factorial of number  "+n+" is: ");
        System.out.println(findFactorial(n));



        System.out.println("No of trailing zero are: ");
        System.out.println(trailingZeroFinder(n));




    }
    
}
