public class BalancedBrackets {
    public static void main(String[] args) {
        
    }

    static String isBalanced(String s) {
        Stack<Character> stacky = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[' ) {
                stacky.push(s.charAt(i));
            } else if (s.charAt(i) == '}' && !stacky.isEmpty()) {
                if (stacky.pop() != '{') {
                    return "NO";
                }
            } else if (s.charAt(i) == ')' && !stacky.isEmpty()) {
                if (stacky.pop() != '(') {
                    return "NO";
                }
            } else if (s.charAt(i) == ']' && !stacky.isEmpty()) {
                if (stacky.pop() != '[') {
                    return "NO";
                }
            }
        }
        return stacky.isEmpty() ? "YES" : "NO";
    }
}