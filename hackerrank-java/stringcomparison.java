import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i = 0; i < s.length()-k+1; i++) {
            if (largest.compareTo(s.substring(i, k+i)) < 0) {
                largest = s.substring(i, k+i);
            }
            if (smallest.compareTo(s.substring(i, k+i)) > 0) {
                smallest = s.substring(i, k+i);
            }
            // System.out.println(s.substring(i, k+i));
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}