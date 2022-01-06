package CrackingTheCodingInterview.Udemy;

import java.util.Stack;

public class RemoveParentheses {
    public static void main(String[] args) {
        
    }
    public String minRemoveToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    s = s.substring(0, i) + "" + s.substring(i+1);
                }
            }
        }
        int left = stack.size();
        while (left > 0) {
            s = s.replaceFirst("(", "");
            left--;
        }
        return s;
    }
}