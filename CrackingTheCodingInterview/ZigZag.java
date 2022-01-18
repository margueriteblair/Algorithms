import java.util.*;

public class ZigZag {
    public static void main(String[] args) {
        int [][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}} ;
        System.out.println(Arrays.toString(zigzag(a)));
    }

    public static int[] zigzag(int[][] matrix) {
        int[] res = new int[matrix.length*(matrix[0].length)];
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    res[count] = matrix[i][j];
                    count++;
                }
            } else {
                for (int j = matrix[i].length-1; j >= 0; j--) {
                    res[count] = matrix[i][j];
                    count++;
                }
            }
        }
        return res;
    }
}