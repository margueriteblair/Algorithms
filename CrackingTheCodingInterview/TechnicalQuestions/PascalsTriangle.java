package CrackingTheCodingInterview.TechnicalQuestions;

public class PascalsTriangle {
    public static void main(String[] args) {
        
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        
        firstRow.add(1);
        res.add(firstRow);
        
        if (numRows == 1) return res;
        
        
        int row = 1;
        while (row < numRows) {
            List<Integer> currRow = new ArrayList<>();
            List<Integer> prev = res.get(row-1);
            currRow.add(1);
            
            for (int col = 1; col < prev.size(); col++) {
                currRow.add(prev.get(col-1) + prev.get(col));
            }
            
            currRow.add(1);
            res.add(currRow);
            row++;
        }
        
        return res;
    }
}