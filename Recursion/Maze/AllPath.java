public class AllPath {
    public static void main(String[] args) {
        boolean[][] board = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        AllDirections("", 0, 0, board);
    }

    static void AllDirections(String path, int row, int col, boolean[][] maze) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(path);
            return;
        }

        if(maze[row][col] == false){
            return;
        }

        // Considering this as the upcoming block in my path which is going to be
        // traversed
        maze[row][col] = false;

        if (row < maze.length - 1) {
            AllDirections(path + 'D', row + 1, col, maze);
        }
        if (col < maze[0].length - 1) {
            AllDirections(path + 'R', row, col + 1, maze);
        }
        if (row > 0) {
            AllDirections(path + 'U', row - 1, col, maze);
        }
        if (col > 0) {
            AllDirections(path + 'L', row, col - 1, maze);
        }

        maze[row][col] = true;

    }
}
