import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Collections;

public class Solution {

    // Complete the isValid function below.
    static String isValid(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        
        Map<Integer, Integer> counts = new HashMap<>();
        
        for (Integer num : map.values()) {
            int value = counts.get(num) == null ? 0 : counts.get(num);
            counts.put(num, value+1);
        }
        
        if (counts.size() == 1) {
            return "YES";
        } else if (counts.size() > 2) {
            return "NO";
        } else if (counts.size() == 2) {
            Iterator<Integer> it = counts.keySet().iterator();
            ArrayList<Integer> twoVals = new ArrayList<>();
            for (Integer num : counts.values()) {
                twoVals.add(num);
            }
            Collections.sort(twoVals);
            if (twoVals.get(0) != 1) {
                return "NO";
            }
                         
        }
        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Collections;

public class Solution {
static String isValid(String s) {

    Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        System.out.println(map);
        
        ArrayList<Integer> lettersCount = new ArrayList<>();
        for (int count : map.values()) {
            lettersCount.add(count);
        }
        Collections.sort(lettersCount);
        
        System.out.println(lettersCount);  
        int min = lettersCount.get(0);
        int max = lettersCount.get(lettersCount.size()-1);
        if (min == max) {
            return "YES";
        } else {
            if ((max-min == 1) && (max > lettersCount.get(lettersCount.size()-2)) || (min == 1) && (lettersCount.get(1) == max)) {
                return "YES";
            }
        }
        return "NO";
    // int min = letters[i];   //the smallest frequency of some letter
    // int max = letters[25]; // the largest frequency of some letter
    // String ret = "NO";
    // if(min == max) ret = "YES";
//     else{
//         // remove one letter at higher frequency or the lower frequency 
//         if(((max - min == 1) && (max > letters[24])) ||
//             (min == 1) && (letters[i+1] == max))
//             ret = "YES";
//     }
//     return ret;
}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

