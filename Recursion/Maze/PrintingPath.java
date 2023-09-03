
public class PrintingPath {
    public static void main(String[] args) {
        Path("", 3, 3);
    }

    static void Path(String path, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(path);
            return;
        }

        if (row > 1) {
            Path(path + 'D', row - 1, col);
        }
        if (col > 1) {
            Path(path + 'R', row, col - 1);
        }

    }
}
