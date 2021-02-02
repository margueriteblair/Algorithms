public class SurfaceArea {
    public static void main(String[] args) {
        
    }
    public static surfaceArea(int[][] A) {
        int area = 0;

        for (int i = 0; i < A.length; i++) {
            int areaOfOneRow = A[i][0];
            for (int j = 0; j < A[i].length - 1; j++) {
                if (A[i][j + 1] > A[i][j]) {
                    areaOfOneRow += A[i][j + 1] - A[i][j];
                }
            }
            area += areaOfOneRow * 2;
        }
    
        for (int i = 0; i < A[0].length; i++) {
            int areaOfOneColumn = A[0][i];
            for (int j = 0; j < A.length - 1; j++) {
                if (A[j + 1][i] > A[j][i]) {
                    areaOfOneColumn += A[j + 1][i] - A[j][i];
                }
            }
            area += areaOfOneColumn * 2;
        }
    
        area += A.length * A[0].length * 2;
    
        return area;
    }

}