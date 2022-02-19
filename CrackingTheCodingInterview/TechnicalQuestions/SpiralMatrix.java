public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int firstRow = 0;
        int firstColumn = matrix[0].length-1;
        int lastRow= matrix.length-1;
        int lastColumn = 0;
        //System.out.println(firstRow + " " + lastRow + " " + firstColumn + " "+ lastColumn);
        while (firstRow <= lastRow && firstColumn >= lastColumn) {
            for (int i = lastColumn; i <= firstColumn; i++) {
                res.add(matrix[firstRow][i]);
            }
            firstRow++;
            if(firstRow > lastRow) {
                break;
            }
            
            for (int i = firstRow; i <= lastRow; i++) {
                res.add(matrix[i][firstColumn]);
            }
            
            firstColumn--;
            if(firstColumn < lastColumn) break;
            
            for (int i = firstColumn; i >= lastColumn; i--) {
                res.add(matrix[lastRow][i]);
            }
            
            lastRow--;
            
           if (firstRow > lastRow) break;
            
            for (int i = lastRow; i >= firstRow; i--) {
                res.add(matrix[i][lastColumn]);
            }
            lastColumn++;
        }
        return res;
}
}