public class array {
  public static void main(String[] args){


    int[][] arr = {
      { 4, 0, 3 },
      { 0, 8, 0},
      { 0, 9, 0},
      
  };
   int n  = arr.length;


     for(int i =0; i<n; i++){
      for(int j = 0; j< n; j++){
          System.out.print(arr[i][j]+ " ");
      }
      System.out.println();
     }

  }
  
}
