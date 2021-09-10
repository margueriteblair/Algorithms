package CrackingTheCodingInterview.Udemy;

import java.util.Stack;

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

    public boolean backspaceCompare2(String s, String t) {
        int i = s.length()-1;
        int j = t.length()-1;

        while (i >= 0 || j >= 0) {
            if (s.charAt(i) == '#' || t.charAt(j) == '#') {
                if (s.charAt(i) == '#') {
                    int backCount = 2;
                    while (backCount > 2) {
                        i--;
                        backCount--;
                        if (s.charAt(i) == '#') {
                            backCount+=2;
                        }
                    }
                }
                if (t.charAt(j) == '#') {
                    int backCount = 2;
                    while (backCount > 0) {
                        j--;
                        backCount--;
                        if (t.charAt(j) == '#') {
                            backCount+=2;
                        }
                    }
                }
            } else {
                if (s.charAt(i) != t.charAt(j)) {
                    
                }
            }
        }
    }
}