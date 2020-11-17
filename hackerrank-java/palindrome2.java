import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {
    public static int countPalindromes(String s) {
    int globalCount = s.length();
    for (int mid = 1; mid < s.length(); mid++) {
        int count = 0;
        
        int low = mid-1;
        int high = mid + 1;
        
        while (low>=0 && high<s.length() && s.charAt((low--)) == s.charAt((high++))) {
            count++;
        }
        globalCount += count;
        count = 0;
        
        low = mid-1;
        high = mid;
        
        while (low >= 0 && high < s.length() && s.charAt(low--) == s.charAt(high++)) {
            count++;
        }
        
        globalCount+=count;
        
    }
        return globalCount;
    }

}
public class Solution {