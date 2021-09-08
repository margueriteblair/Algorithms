package CrackingTheCodingInterview.Udemy;

public class BackspaceCompare {
    public static void main(String[] args) {
        
    }

    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!sStack.isEmpty()) {
                    sStack.pop();
                }
            } else {
                sStack.push(s.charAt(i));
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (!tStack.isEmpty()) {
                    tStack.pop();
                }
            } else {
                tStack.push(t.charAt(i));
            }
        }
        if (sStack.size() != tStack.size()) {
            return false;
        } else {
            while (!sStack.isEmpty()) {
                if (sStack.pop() != tStack.pop()) {
                    return false;
                }
            }
        }
        return true;
    }
}