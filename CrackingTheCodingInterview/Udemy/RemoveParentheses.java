package CrackingTheCodingInterview.Udemy;

import java.util.Stack;

public class RemoveParentheses {
    public static void main(String[] args) {
        
    }
    public String minRemoveToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
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
        System.out.println(Arrays.toString(arr));
        int left = stack.size();

        String res = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Character.MIN_VALUE) {
                res += "";
            } else {
              res += String.valueOf(arr[i]);  
            }
            
        }
        while (left > 0) {
            res = res.replaceFirst("\\(", "");
            left--;
        }
        return res;
    }
}