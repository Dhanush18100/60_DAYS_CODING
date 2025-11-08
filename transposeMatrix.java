import java.util.ArrayList;

public class transposeMatrix {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 1, 1, 1},
            {2, 2, 2, 2},
            {3, 3, 3, 3},
            {4, 4, 4, 4}
        };

        ArrayList<ArrayList<Integer>> res = transpose(mat);

        for (ArrayList<Integer> row : res) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
        
        
    }
    public static ArrayList<ArrayList<Integer>> transpose(int[][]mat){
        int rows=mat.length;
        int cols=mat[0].length;
        ArrayList<ArrayList<Integer>>tMatrix=new ArrayList<>();
        for(int i=0;i<rows;i++){
            ArrayList<Integer> row=new ArrayList<>();
            for(int j=0;j<cols;j++){
                row.add(mat[j][i]);
            }
            tMatrix.add(row);
        }
        return tMatrix;
    }
}
