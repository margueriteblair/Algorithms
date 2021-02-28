public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else if (!stack.isEmpty() && s.charAt(i) ==')') {
                if (stack.pop() != s.charAt(i)) {
                    return false;
                }
            } else if (!stack.isEmpty() && s.charAt(i) ==']') {
                if (stack.pop() != s.charAt(i)) {
                    return false;
                }
            } else if (!stack.isEmpty() && s.charAt(i) =='}') {
                if (stack.pop() != s.charAt(i)) {
                    return false;
                }
            }
        }
        System.out.println(stack);
        return stack.isEmpty() ? true : false;
    }
}