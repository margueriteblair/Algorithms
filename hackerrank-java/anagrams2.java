import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        java.util.Map<Character, Integer> mapA = new java.util.HashMap<>();
        java.util.Map<Character, Integer> mapB = new java.util.HashMap<>();
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        if (a.length() != b.length()) {
            return false;
        }
        
        for (int i = 0; i < a.length(); i++) {
            if (!mapA.containsKey(a.charAt(i))) {
                mapA.put(a.charAt(i), 1);
            } else {
                mapA.put(a.charAt(i), mapA.get(a.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (!mapB.containsKey(b.charAt(i))) {
                mapB.put(b.charAt(i), 1);
            } else {
                mapB.put(b.charAt(i), mapB.get(b.charAt(i)) + 1);
            }
        }
        
        if (mapA.equals(mapB)) return true;
        else return false;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
