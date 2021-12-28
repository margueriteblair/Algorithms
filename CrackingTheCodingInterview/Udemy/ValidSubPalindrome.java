public class ValidSubPalindrome {
    public static void main(String[] args) {
        
    }

    public boolean validPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int invalidCount = 0;
        int i = 0;
        int j = s.length()-1;
        
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                //"ceac"
                if (!isPalindrome(s.substring(0, i) + s.substring(i+1))) {
                    invalidCount++;
                }
                if (!isPalindrome(s.substring(0, j) + s.substring(j+1))) {
                    invalidCount++;
                }
            }
            i++;
            j--;
        }
        if (invalidCount > 1) {
            return false;
        }
        return true;
    }
    
    public boolean isPalindrome(String s) {
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
}