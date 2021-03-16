public class PascalsTriangle2 {
    public static void main(String[] args) {
        
    }

    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> currow = new ArrayList<Integer>();
        currow.add(1);
        if (rowIndex == 0) {
            return currow;
        }
        List<Integer> prev = getRow(rowIndex
                                         - 1);
 
        for (int i = 1; i < prev.size(); i++) {
            // Generate the elements
            // of the current row
            // by the help of the
            // previous row
            int curr = prev.get(i - 1)
                       + prev.get(i);
            currow.add(curr);
        }
        currow.add(1);

        return currow;
    }
}