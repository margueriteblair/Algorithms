public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else if (!stack.isEmpty() && s.charAt(i) ==')') {
                if (stack.pop() != '(') {
                    return false;
                }
            } else if (!stack.isEmpty() && s.charAt(i) ==']') {
                if (stack.pop() != '[') {
                    return false;
                }
            } else if (!stack.isEmpty() && s.charAt(i) =='}') {
                if (stack.pop() != '{') {
                    return false;
                }
            } else if (stack.isEmpty()) {
                return false;
            }
        }
        return stack.isEmpty() ? true : false;
    }
}