import java.util.*;

public class LargeElement {
public static int LargeElementArray(int[] arr,int max)
{
       
     max = arr[0];


    for(int i=0; i< arr.length; i++){
        if(arr[i] > max){
            max = arr[i];
        }


}
return max;

} 


    public static void main(String[] args) 
    {
        int max= 0;
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 3, 443, 434, 232, 4232, 4, 23 };

        System.out.println("Largest element is : " + LargeElementArray(arr, max));

    }

}
