public class DiagonalPath {
    public static void main(String[] args) {
        printPath("", 3, 3);
    }

    static void printPath(String processed,int row, int col){
        if(row == 1 && col == 1){
            System.out.println(processed);
            return;
        }
        if(row > 1 && col > 1){ 
            printPath(processed + 'D', row-1, col-1);
        }
        if(row > 1){
            printPath(processed + 'H', row-1, col);
        }
        if(col > 1){
            printPath(processed + 'V', row, col-1);
        }
    }
}
