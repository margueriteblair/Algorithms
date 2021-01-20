package codility2;

import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        
    }

    public int solution(String S) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '{' || S.charAt(i) == '('  || S.charAt(i) == '[' ){
                stack.push(S.charAt(i));
            } else if (!stack.isEmpty() && S.charAt(i) == '}') {
                if (stack.pop() != '{') return 0;
            } else if (!stack.isEmpty() && S.charAt(i) == ']') {
                if (stack.pop() != '[') return 0;
            } else if (!stack.isEmpty() && S.charAt(i) == ')') {
                if (stack.pop() != '(') return 0;
        }
    }
    return stack.isEmpty() ? 1 : 0;
}
}