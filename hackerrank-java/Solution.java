import java.util.*;

public class Solution {

    static long candies(int n, int[] arr) {
        int total = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        right[0] = 1;
        left[0] = 1;
        left[n-1] = 1;
        right[n-1] = 1;
        
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i-1]) {
                left[i] = left[i-1] + 1;
            } else {
                left[i] = 1;
            }
        }
        
        for (int i = n-2; i >= 0; i--) {
            if (arr[i] > arr[i+1]) {
                right[i] = right[i+1] + 1;
            } else {
                right[i] = 1;
            }
        }                
        
        for (int i = 0; i < arr.length; i++) {
            total += Math.max(left[i], right[i]);
        }
        System.out.println(total);
        return total;
    }

    public static void main(String[] args) {
        int[] arg = new int[100000];
        for (int i = 1; i <= 100000; i++) {
            arg[i-1] = i;
        }

        System.out.println(candies(100000, arg));
    }
}
//5000050000