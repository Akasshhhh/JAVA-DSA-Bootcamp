public class ObstacleinPath {
    //Cannot move to [1,1]
    public static void main(String[] args) {
        boolean[][] board = {
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
        ObstaclePath("", 0, 0, board);
    }

    static void ObstaclePath(String Path, int row, int col, boolean[][] maze){
        if(maze[row][col] == false){
            return;
        }
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(Path);
            return;
        }
        if(row < maze.length - 1){
            ObstaclePath(Path + 'R', row+1, col, maze);
        }
        if(col < maze[0].length - 1){
            ObstaclePath(Path + 'D', row, col+1, maze);
        }
    }
}
