public class CyclicalArray {
    public static void main(String[] args) {
        
    }

    class Solution {
        public int[] solution(int[] A, int K) {
            // write your code in Java SE 8
            int[] B = new int[A.length];
            for (int i = 0; i < A.length; i++) {
                if (i+K >= A.length) {
                    B[Math.abs(B.length-(i+K))] = A[i];
                } else {
                    B[i+K] = A[i];
                }
            }
            // System.out.println(B);
            return B;
        }
    }}