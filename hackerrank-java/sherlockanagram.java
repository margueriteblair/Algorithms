import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        int count = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length();j++) {
                String subStr = s.substring(i, j);
                String[] arr = subStr.split("");
                Arrays.sort(arr);
                String sub = String.join("", arr);
                if (!map.containsKey(sub)) {
                    map.put(sub, 1);
                } else {
                    map.put(sub, map.get(sub) + 1);
                }
            }
        }
        
        for (int vals : map.values()) {
            if (vals > 1) {
                count += vals;
            }
        }
        System.out.println(map);
        return count/2;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
