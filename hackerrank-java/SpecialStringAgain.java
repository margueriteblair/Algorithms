import java.util.*;

public class SpecialStringAgain {
    public static void main(String[] args) {
        System.out.println(substrCount("herghjhcxzfghjk"));
    }

    static long substrCount(String s) {
        int count = 0;
        List<String> substringList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                substringList.add(s.substring(i, j));
            }
        }
        for (int i = 0; i < substringList.size(); i++) {
            if (isSpecial(substringList.get(i)) == true) {
                count++;
            }
        }
        return count;
    }
    
    static boolean isSpecial(String sub) {
        char[] charArr = sub.toCharArray();
        Arrays.sort(charArr);
        if (sub.length() == 1) return true;
        if (charArr[0] == charArr[charArr.length-1]) return true;
        if (sub.length() % 2 == 1) {
            System.out.println(sub);
            if (sub.substring(0, (sub.length()/2)).equals(sub.substring(sub.length()/2+1))) {
                return true;
            }
        }
        return false;
    }

    static long substrCount2(int n, String s) {
        int counter = n;
                
    // to count consecutive characters that are the same
    int consec = 1;
                
    // the middle index of a 3-character symmetry,
    // assigned only once detected
    int midIndex = -1;
                
    // compare with previous character so start with i=1
    for (int i = 1; i < n; i++) {
        if (s.charAt(i) == s.charAt(i-1)) {
            // Condition 1: All of the characters are the same
            // For n consecutive characters that are the same,
            // we have this formula:
            // Number of palindromic strings =
            //     (n-1) + (n-2) + ... + (n-(n-1))
            counter += consec;
            consec++;
                
            // Condition 2: All characters except the middle one
            // are the same
            if (midIndex > 0) {
                // check for symmetry on both sides
                // of the midIndex
                if ((midIndex-consec) > 0 && s.charAt(midIndex-consec) == s.charAt(i)) {
                    counter++;
                } else {
                    // no more possibility of palindromic string
                    // with this midIndex
                    midIndex = -1; 
                }
            }
        } else {
            // reset consecutive chars counter to 1
            consec = 1;
                
            // check for a 3-character symmetry
            if (((i-2) >= 0) && s.charAt(i-2) == s.charAt(i)) {
                counter++; // 3-char symmetry is detected
                    
                // to check if the next characters are the same
                // and symmetrical along the midIndex
                midIndex = i-1;
            } else {
                midIndex = -1;
            }
        }
    }
    return counter;
    }
}