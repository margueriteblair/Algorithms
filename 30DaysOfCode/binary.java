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
        int n = scanner.nextInt();
        int countBin = 0;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String strBin = Integer.toBinaryString(n).toString();
        int count = 0;
        for (int i = 0; i < strBin.length(); i++) {
            if (strBin.charAt(i) == '1') {
                count++;
                if (count > countBin) {
                    countBin = count;
                }
            } else if (strBin.charAt(i) == '0') {
                count = 0;
            }
        }
        System.out.println(countBin);
        scanner.close();
    }
}
