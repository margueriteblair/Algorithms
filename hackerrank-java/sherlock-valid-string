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
