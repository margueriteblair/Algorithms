package CrackingTheCodingInterview.Udemy;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringNoRepeats {
    public static void main(String[] args) {
        
    }

    public int lengthOfLongestSubstring(String s) {
        if(s.length() <2){
            return s.length();
        }
        Set<Character> set = new HashSet<>();
        int max =0, i=0, j=0;
        while(j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                max = Math.max(max, set.size());
                j++;
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
        }

        public int lengthOfLongestSubstring2(String s) {
            if (s.length() < 2) {
                return s.length();
            }
            
            int maxLen = 0;
            int i = 0;
            Set<Character> set = new HashSet<>(); //space is O(n) for this
            for (int j = 0; j < s.length(); j++) {
                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j));
                    maxLen = Math.max(maxLen, set.size());
                } else {
                    set.remove(s.charAt(i));
                    i++;
                    j--;
                }
            }
            return maxLen;
        }
}