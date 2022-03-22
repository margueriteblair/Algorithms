package CrackingTheCodingInterview.TechnicalQuestions;

import java.util.*;

public class ReshapingMatrix {
    public static void main(String[] args) {
        
    }

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] res = new int[r][c];
        if (mat.length == 0 || r * c != (mat[0].length * mat.length)) {
            return mat;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++){
                queue.add(mat[i][j]);
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = queue.remove();
            }
        }
        return res;
    }
}