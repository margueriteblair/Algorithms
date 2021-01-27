public class IsValidPalindrome2 {
    public static void main(String[] args) {
        
    }
    public boolean isPalindrome(String s) {
        if (s.equals("") || s.equals(" ")) return true;
        String newString = s.replaceAll("[^A-Za-z0-9]", "");
        String firstHalf = newString.substring(0, newString.length()/2).toLowerCase();
        int middle = newString.length() % 2 == 0 ? newString.length()/2 : newString.length()/2 + 1;
        String secondHalf = newString.substring(middle, newString.length()).toLowerCase();

        
        for (int i = 0; i < secondHalf.length(); i++) {
            if (secondHalf.charAt(i) != firstHalf.charAt(firstHalf.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}