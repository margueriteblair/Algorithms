package CrackingTheCodingInterview.TechnicalQuestions;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        //n is between 1 and 8, when it's low nums like this we can generally assume backtracking
        //each pair of parenthesis is "()"
        List<String> res = new ArrayList<>();
        backtrack(new StringBuilder(), res, 0, 0, n);
        
        return res;
        
    }
    
    private void backtrack(StringBuilder curr, List<String> res, int open, int close, int max) {
        if (curr.length() == max * 2) {
            //not only should curr.length be equal to n, but we need to validate if it's parenthesis are properly nested.
            res.add(curr.toString());
            return;
        }
        
        if (open < max) {
            curr.append("(");
            backtrack(curr, res, open+1, close, max);
            curr.deleteCharAt(curr.length() - 1);
        }
        
        if (close < open) {
            curr.append(")");
            backtrack(curr, res, open, close+1, max);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}