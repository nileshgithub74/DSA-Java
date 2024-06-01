import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 23, 3, 3, 3, 4, 3, 3 };
        int[] temp = new int[arr.length];
        temp[0] = arr[0];
        int result = 1;

        for (int i = 1; i < arr.length; i++) {
            if (temp[result - 1] != arr[i]) {
                temp[result] = arr[i];
                result++;
            }
        }

        for (int i = 0; i < result; i++) {
            arr[i] = temp[i];
        }

        for (int i = 0; i < result; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
