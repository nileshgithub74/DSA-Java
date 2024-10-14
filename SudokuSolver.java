import java.util.*;

public class SudokuSolver {
    static final int EMPTY = 0;           
    static final int N = 9;     


    static boolean findEmptyCell(int[][] grid, int[] cell) {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                if (grid[row][col] == EMPTY) {
                    cell[0] = row;
                    cell[1] = col;
                    return true;
                }
            }
        }
        return false;
    }

    static boolean solve(int[][] grid) {
        int[] cell = new int[2];
        
        if (!findEmptyCell(grid, cell))
            return true;       

        int row = cell[0];
        int col = cell[1];

        for (int num = 1; num <= 9; num++) {
            if (isSafe(grid, row, col, num)) {
                grid[row][col] = num;

                if (solve(grid))
                    return true;       // Return if solve is successful

                grid[row][col] = EMPTY;   // Backtrack and try the next number
            }
        }
        return false;
    }

    static boolean colFind(int[][] grid, int col, int num){
        for(int row =0; row<N; row++){
            if(grid[row][col] ==num){
                return true;
            }
        }
        return false;
    }
    
   static boolean rowFind(int[][] grid, int row, int num) {
     for (int col = 0; col < N; col++) {
            if (grid[row][col] == num)
                return true;
        }
        return false;
    }

    static boolean subMatrixFind(int[][] grid, int boxStartRow, int boxStartCol, int num) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (grid[row + boxStartRow][col + boxStartCol] == num)
                    return true;
            }
        }
        return false;
    }
    

    static boolean isSafe(int[][] grid, int row, int col, int num) {
        return (!rowFind(grid, row, num) && !colFind(grid, col, num) && !subMatrixFind(grid, row - row % 3, col - col % 3, num) && grid[row][col] == EMPTY);
    }

    static void printSudoku(int[][] grid) {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] grid = {
            { 4, 0, 0, 2, 6, 0, 7, 0, 1 },
            { 0, 8, 0, 0, 7, 0, 0, 9, 0 },
            { 0, 9, 0, 0, 0, 4, 5, 0, 0 },
            { 8, 2, 0, 1, 0, 0, 0, 4, 0 },
            { 0, 0, 4, 6, 0, 2, 0, 0, 0 },
            { 0, 5, 0, 0, 0, 3, 0, 2, 8 },
            { 0, 0, 9, 3, 0, 0, 0, 7, 4 },
            { 0, 4, 0, 0, 5, 0, 0, 3, 6 },
            { 7, 0, 3, 0, 1, 8, 0, 0, 0 }
        };
        if (solve(grid))
            printSudoku(grid);
        else
            System.out.println("No arrangement possible");
    }
}


  

