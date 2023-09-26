public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        char[][] boards = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boards[i][j] = '_';
            }
        }
        System.out.println(knights(boards, 0));
    }

    static int knights(char[][] boards, int row) {
        if (row == boards.length) {
            for (int i = 0; i < boards.length; i++) {
                for (int j = 0; j < boards.length; j++) {
                    System.out.print(boards[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return 1;
        }

        int count = 0;
        for(int col = 0; col < boards.length;col++){
            if(isSafe(boards,row,col)){
                boards[row][col] = 'K';
                count += knights(boards, row+1);
                boards[row][col] = '_';
            } 
           
        }
        return count++;
    }

    private static boolean isSafe(char[][] boards, int row, int col) {
        int n = boards.length;
        int i = row;
        int j = col;
        while(i >= 0 && j < n){
            if(boards[row][col] == 'K'){
                return false;
            }
            i--;
            j += 2;
        }
         i = row;
         j = col;
        while(i >= 0 && j < n){
             if(boards[row][col] == 'K'){
                return false;
            }
            i++;
            j += 2;
        }
        while(i >= 0 && j < n){
             if(boards[row][col] == 'K'){
                return false;
            }
            i += 2;
            j--;
        }
        while(i >= 0 && j < n){
             if(boards[row][col] == 'K'){
                return false;
            }
            i--;
            j -= 2;
        }
        

        return true;
    }
}
