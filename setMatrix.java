import java.util.Arrays;

public class setMatrix {
    public static void main(String[] args) {
        int[][] mat = { { 1, 0, 0, 1 }, { 0, 0, 1, 0 }, { 0, 0, 0, 0 } };
        booleanMatrix(mat);
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    static void booleanMatrix(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1) {
                    for (int idx = 0; idx < rows; idx++) {
                        if (mat[idx][j] == 0) {
                            mat[idx][j] = -1;
                        }
                    }

                    for (int idx = 0; idx < cols; idx++) {
                        if (mat[i][idx] == 0) {
                            mat[i][idx] = -1;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == -1) {
                    mat[i][j] = 1;
                }
            }
        }
    }
}