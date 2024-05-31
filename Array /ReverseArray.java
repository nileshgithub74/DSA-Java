// import java.util.*;

// public class ReverseArray {

//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the length of the array: ");
//     int len = sc.nextInt();

//     int[] arr= new int[len];

//     for(int i=0; i< arr.length; i++){
//         arr[i] = sc.nextInt();
//     }


//     for(int i=0; i<arr.length; i++){
//         System.out.print(arr[i] +" ");
//     }


//     int revArr[] = new int[len];
//     System.out.println(" Reverse array : ");
//     for(int  i=0; i< len; i++){
//         revArr[i] = arr[len -i-1];
//     }
//     for(int i =0; i<len; i++){
//         System.out.println(revArr[i]);
//     }

    
   



//   }

    
// }



  //================== 2nd Method ===============






import java.util.*;

public class ReverseArray {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the array: ");
    int len = sc.nextInt();

    int[] arr= new int[len];

    for(int i=0; i< arr.length; i++){
        arr[i] = sc.nextInt();
    }


    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] +" ");
    }


    System.out.println("Reversed Array: ");

    for(int i =0, j= arr.length-1; i<j; i++,j--){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
    }


    

    
   



  }
    
}

