public class MaxSlice {
    public static void main(String[] args) {
        solution(new int[] {1,2,3,4,5});
    }

    public static int solution(int[] A) {
        int maxProfit = 0;
        for (int i = 0; i < A.length-1; i++) {
            for (int j = i+1; j < A.length; j++) {
                if (A[j]-A[i] > maxProfit) {
                    maxProfit = A[j]-A[i];
                }
            }
        }
        return maxProfit;
    }


}