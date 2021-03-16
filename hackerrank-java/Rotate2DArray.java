public class Rotate2DArray {
    public static void main(String[] args) {
        
    }

    public void rotate(int[][] matrix) {
        int cycles = matrix.length / 2;
        for (int i = 0; i < cycles; i++) {
            for (int j = i; j < cycles - j; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][matrix.length - 1 - i]; 
                matrix[j][matrix.length - 1 - i] = matrix[matrix.length - 1 - i][matrix.length - 1 - j];
                matrix[matrix.length - 1 - i][matrix.length - 1 - j] = matrix[matrix.length - 1 - j][i]; 
                matrix[matrix.length - 1 - j][i] = temp; 
            }
        }
    }
}