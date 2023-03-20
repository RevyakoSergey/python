package java_projects;


public class les5_3 {
    public static void main(String[] args) {
        char[][] board = new char[8][8];
                for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = '-';
            }
        }
        solveQueens(board, 0);
        printBoard(board);
    }


   
    public static boolean solveQueens(char[][] board, int row) {
        if (row == 8) {
            return true;
        }
        for (int col = 0; col < 8; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';

                if (solveQueens(board, row + 1)) {
                    return true;
                }
                board[row][col] = '-';
            }
        }
        return false;
    }
    public static boolean isSafe(char[][] board, int row, int col) {
    
        for (int i = 0; i < 8; i++) {
            if (board[row][i] == 'Q' || board[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j < 8; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

  
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}