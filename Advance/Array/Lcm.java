package Advance.Array;
import java.util.*;

public class Lcm {


    // static int lcmFinder(int a, int b){
    //     int result = Math.max(a, b);
    //     while(true){
    //         if(result % a == 0 && result % b == 0){
    //             return result;
    //         }
    //         else{ 
    //             result += Math.max(a, b);
    //         }
            
    //     }
        
    // }
    static int gcd(int a, int b){
        if(b ==0){
            return a;
        }
        return  gcd( b, a% b);
    }

    static int lcmFinder(int a, int b){
        return (a*b)/gcd(a,b);
    }
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number a: ");
        int a = sc.nextInt();
        System.out.println("enter the number b : ");
        int b = sc.nextInt();

        System.out.println("Lcm of the number : ");
        System.out.println(lcmFinder(a, b));
    }
    
}
