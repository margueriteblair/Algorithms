package CrackingTheCodingInterview.Udemy;

public class RemoveParentheses {
    public static void main(String[] args) {
        
    }
    public String minRemoveToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int leftCount = 0;
        int rightCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    rightCount++;
                }
            }
        }
        leftCount += stack.size();
        
        while (leftCount > 0) {
            s = s.replaceFirst("(", "");
            leftCount--;
        }
        while (rightCount > 0) {
            s = s.replaceFirst("\\)", "");
            rightCount--;
        }
        return s;
    }
}