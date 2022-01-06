public class RemoveParentheses2 {
    public static void main(String[] args) {
        
    }

    public String minRemoveToMakeValid(String s) {
        String[] res = s.split("");
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < res.length; i++) {
            if (res[i].equals("(")) {
                stack.push(i);
            } else if (res[i].equals(")") && !stack.isEmpty()) {
                stack.pop();
            } else if (res[i].equals(")") && stack.isEmpty()) {
                res[i] = "";
            }
        }
        while (!stack.isEmpty()) {
            int currIndex = stack.pop();
            res[currIndex] = "";
        }
        System.out.println(Arrays.toString(res));
        return String.join("", res);
    }
}