package CrackingTheCodingInterview.TechnicalQuestions;

public class IsToeplitz {
    public boolean isToeplitz(int[][] matrix){
        if (matrix.length < 1) {
          return false;
        } else if (matrix.length < 2) {
          return true;
        }
        
        for(int i=1; i<matrix.length; i++){
          for(int j=1; j<matrix.length; j++){
                if(matrix[i][j] != matrix[i-1][j-1]) {
                    return false;
                }
          }
          
        }
        
        return true;
      }
}