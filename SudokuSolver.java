public class SudokuSolver {

  private static final int SIZE = 9;

  public static void main(String[] args) {
      int[][] board = {
          {5, 3, 0, 0, 7, 0, 0, 0, 0},
          {6, 0, 0, 1, 9, 5, 0, 0, 0},
          {0, 9, 8, 0, 0, 0, 0, 6, 0},
          {8, 0, 0, 0, 6, 0, 0, 0, 3},
          {4, 0, 0, 8, 0, 3, 0, 0, 1},
          {7, 0, 0, 0, 2, 0, 0, 0, 6},
          {0, 6, 0, 0, 0, 0, 2, 8, 0},
          {0, 0, 0, 4, 1, 9, 0, 0, 5},
          {0, 0, 0, 0, 8, 0, 0, 7, 9}
      };

      if (solve(board)) {
          printBoard(board);
      } else {
          System.out.println("Unsolvable");
      }
  }

  private static boolean solve(int[][] board) {
      for (int row = 0; row < SIZE; row++) {
          for (int col = 0; col < SIZE; col++) {
              if (board[row][col] == 0) {
                  for (int num = 1; num <= 9; num++) {
                      if (isValid(board, num, row, col)) {
                          board[row][col] = num;
                          if (solve(board)) {
                              return true;
                          }
                          board[row][col] = 0;
                      }
                  }
                  return false;
              }
          }
      }
      return true;
  }

  private static boolean isValid(int[][] board, int num, int row, int col) {
      for (int i = 0; i < SIZE; i++) {
          if (board[row][i] == num || board[i][col] == num || board[row - row % 3 + i / 3][col - col % 3 + i % 3] == num) {
              return false;
          }
      }
      return true;
  }

  private static void printBoard(int[][] board) {
      for (int[] row : board) {
          for (int num : row) {
              System.out.print(num + " ");
          }
          System.out.println();
      }
  }
}

