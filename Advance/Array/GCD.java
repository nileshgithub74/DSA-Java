package Advance.Array;
import java.util.*;

public class GCD {

    // static int gcd(int a,  int b){
    //     while( a != b){
    //         if(a> b){
    //             a = a-b;
    //         }
    //         else{
    //             b = b-a;
    //         }
    //     }
       
    //     return a;
    // }

    // static int gcd(int a, int b){
    //     int result = Math.min(a,b);
    //     while(result > 0){
    //     if( a% result ==0 && b % result ==0){
    //         break;
    //     }
    //     result --;
    // }
    //     return result;
    // }

    static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a: ");
        int a = sc.nextInt();
        System.out.println("Enter the number b: ");
        int b = sc.nextInt();

        System.out.println("Gcd of given number is: ");
        System.out.println(gcd(a, b));

    }
    
}
