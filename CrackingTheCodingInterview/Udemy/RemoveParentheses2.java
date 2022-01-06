public class RemoveParentheses2 {
    public static void main(String[] args) {
        
    }

    public static String minRemoveToMakeValid(String s) {
        String res = s.split("");
        Stack<Integer> stack = new Stack<>();
        for (int i = 0;i < res.length; i++) {
            if (res[i] == "(") {
                stack.push(i);
            } else if (res[i] == ")" && !stack.isEmpty()) {
                stack.pop();
            } else if (stack[i] == ")") {
                res[i] = "";
            }
        }
        while (!stack.isEmpty()) {
            int currIndex = stack.pop();
            res[currIndex] = "";
        }

        return String.join("", res);
    }
}