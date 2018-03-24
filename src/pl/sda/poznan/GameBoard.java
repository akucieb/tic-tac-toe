package pl.sda.poznan;

public class GameBoard {
    private char[][] board = new char[3][3];


    public void print() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            if (i != 2)
                System.out.println("\n----------");
        }
    }

    public boolean isValidMove(int number) {
        if (number < 0 || number > 8)
            return false;

        int row = number / 3;
        int col = number % 3;
        return board[row][col] == 0;
    }

    public boolean add(String position, char playerSign) {
        int number = Integer.parseInt(position);
        int row = number / 3;
        int col = number % 3;
        board[row][col] = playerSign;
        return isWinningMove(playerSign);
    }

    public boolean isWinningMove(char playerSign) {
        return checkColumns() || checkRow() || checkDiagonals(playerSign);
    }

    private boolean checkRow() {

        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != 0)
                return true;
        }
        return false;
    }

    private boolean checkColumns() {
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != 0)
                return true;
        }
        return false;
    }

    private boolean checkDiagonals(char playerSign) {
        return (board[0][0] == board[1][1] && board[1][1] == board[2][2] ||
                board[0][2] == board[1][1] && board[1][1] == board[2][0]) && board[1][1] != 0;
    }
}
