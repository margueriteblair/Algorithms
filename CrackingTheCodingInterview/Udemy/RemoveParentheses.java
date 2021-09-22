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
        System.out.println(leftCount + " " + rightCount);
        while (leftCount > 0) {
            s.remove('(');
            leftCount--;
        }
        while (rightCount > 0) {
            s.remove(')');
            rightCount--;
        }
        return s;
    }
}