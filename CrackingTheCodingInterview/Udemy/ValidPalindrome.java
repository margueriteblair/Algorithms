package CrackingTheCodingInterview.Udemy;

public class ValidPalindrome {
    public static void main(String[] args) {
        
    }

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        System.out.println(s);
        int i = 0;
        int j = s.length()-1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        if (isPalindrome2(s, null)) {
            return true;
        }
        int i = 0;
        int j = s.length()-1;
        
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                boolean one = isPalindrome(s, i);
                boolean two = isPalindrome(s, j);
                if (one == true) {
                    return true;
                }
                if (two == true) {
                    return true;
                }
                return false;
            }
        }
        
        
    }
    
    public static boolean isPalindrome2(String s, int index) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        
        int i = 0;
        int j = s.length()-1;
        while (i < j) {
            if (i == index) {
                i++;
            } else if (j == index) {
                j++;
            }
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}