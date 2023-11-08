import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                board[i][j] = ' ';
            }
        }
        
        char player = 'X';
        boolean gameOver = false;

        Scanner in = new Scanner(System.in);

        while(!gameOver){
            printBoard(board);
            System.out.print("Enter your move" + player + ":");
            int row = in.nextInt();
            int col = in.nextInt();
            if(checkValid(board,row,col)){
                board[row][col] = player;
                gameOver = haveWon(board, player);
                if(gameOver){
                    System.out.println(player + " has Won.");
                }else{
                    player = (player == 'X') ? 'O' : 'X';
                }
            }
        }
    }

    private static boolean haveWon(char[][] board, char player) {
        //checking for rows
        for(int row = 0; row < board.length; row++){
            if(board[row][0] == player && board[row][1] == player && board[row][2] == player){
                return true;
            }
        }
        //checking for columns
        for(int col = 0; col < board.length; col++){
            if(board[0][col] == player && board[1][col] == player && board[2][col] == player){
                return true;
            }
        }
        //checking for diagonals
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }
        if(board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }

        return false;
    }

    private static boolean checkValid(char[][] board, int row, int col) {
        if(row > 2 || col > 2){
            System.out.println("Enter numbers within range");
        }
        if(board[row][col] == ' '){
            return true;
        }else {
            System.out.println("Try another move!");
        }
        return false;
    }

    private static void printBoard(char[][] board) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
