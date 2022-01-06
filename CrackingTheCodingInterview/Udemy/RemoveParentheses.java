package CrackingTheCodingInterview.Udemy;

import java.util.Stack;

public class RemoveParentheses {
    public static void main(String[] args) {
        
    }
    public String minRemoveToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    arr[i] = Character.MIN_VALUE;
                }
            }
        }
        
        for (int i = arr.length-1; i >= 0; i--) {
            if (s.charAt(i) == ')') {
                stack2.push(s.charAt(i));
            } else if (s.charAt(i) == '(') {
                if (stack2.isEmpty() || stack2.pop() != ')') {
                    arr[i] = Character.MIN_VALUE;
                }
            }
        }

        String res = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Character.MIN_VALUE) {
                res += "";
            } else {
              res += String.valueOf(arr[i]);  
            }
            
        }

        return res;
    }
}