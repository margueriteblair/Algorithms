import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int tItr = 0; tItr < t; tItr++) {
            int max = 0;
            String[] nk = scanner.nextLine().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            for (int b = n; b > 0; b--) {
            for (int a = b-1; a > 0; a--) {
                if ((a&b) < k && (a&b) > max) {
                    max = (a&b);
                }
            }
        }
        System.out.println(max);
        }
        


        scanner.close();
    }
}
