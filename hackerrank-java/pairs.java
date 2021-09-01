import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the pairs function below.
    static int pairs(int k, int[] arr) {
        HashSet<Integer> indexMap = new HashSet<>();
        Arrays.sort(arr);
        int numPairs = 0;
        
        for (int i = 0; i < arr.length; i++) {
            indexMap.add(arr[i]);
        }
        
        for (int index : indexMap) {
            if (indexMap.contains(index+k)) {
                numPairs++;
            }
        }
        return numPairs;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = pairs(k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

    public static int pairs(int k, List<Integer> arr) {
        // Write your code here
            int count = 0;
            for (int i = 0; i < arr.size(); i++) {
                if (arr.indexOf(k-arr.get(i)) != -1) {
                    count++;
                }
            }
            return count;
        }
    
}
