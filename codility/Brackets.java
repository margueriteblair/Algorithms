public class Brackets {
    public static void main(String[] args) {
        
    }

    public static int solution(String S) {
            if (S.length() == 0) return 1;
           Stack<Character> stacky = new Stack<>();
           for (int i = 0; i < S.length(); i++) {
               if (S.charAt(i) == '{' || S.charAt(i) == '(' || S.charAt(i) == '[') {
                   stacky.push(S.charAt(i));
               } else if (S.charAt(i) == '}') {
                   if (stacky.isEmpty() || stacky.pop() != '{') {
                       return 0;
                   }
               }else if (S.charAt(i) == ')') {
                   if (stacky.isEmpty() || stacky.pop() != '(') {
                       return 0;
                   }
               }else if (S.charAt(i) == ']') {
                   if (stacky.isEmpty() || stacky.pop() != '[') {
                       return 0;
                   }
               }
           }
           return stacky.isEmpty() ? 1 : 0;
        }
}