public class ValidPalindrome {
    public static void main(String[] args) {
        
    }

    public boolean isPalindrome(String s) {
        Map<Character, Integer> dict = new HashMap<>();
        int oddCounter = 0;
        String newStr = s.replaceAll("[^A-Za-z0-9]", "");
        System.out.println(newStr);
        for (int i = 0; i < newStr.length(); i++) {
            int count = dict.getOrDefault(newStr.charAt(i), 0);
            dict.put(newStr.charAt(i), count+1);
            if (count+1 % 2 == 1) oddCounter++;
            if (count+1 % 2 == 0) oddCounter--;
        }
        return oddCounter > 1 ? false : true;
    }
}