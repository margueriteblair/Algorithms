import java.util.*;

public class Solution {

    public static int fibonacci(int n) {
        int[] fibonaccis = new int[n+1];
        fibonaccis[0] = 0;
        fibonaccis[1] = 1;
        
        for (int i = 2; i <=n; i++) {
            fibonaccis[i] = fibonaccis[i-1] + fibonaccis[i-2];
        }
        
        // System.out.println(Arrays.toString(fibonaccis));
        return fibonaccis[n];
       
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}