public class IsPalindrome {
    public static void main(String[] args) {
        
    }

    public boolean isPalindrome(String s) {
        if (s.equals("") || s.equals(" ")) return true;
        String newString = s.replaceAll("[^A-Za-z0-9]", "");
        char[] arr = newString.toLowerCase().toCharArray();
        int i = 0;
        int j = arr.length-1;
        while (j > i) {
            if (arr[i] != arr[j]) {
                return false;
            }
            
            j--;
            i++;
        }
        return true;
    }
}