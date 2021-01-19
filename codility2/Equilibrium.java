package codility2;

public class Equilibrium {
    public static void main(String[] args) {
        solution(new int[] {1,2,3,45,4});
    }

    public static int solution(int[] A) {
        int leftSum = A[0];
        int rightSum = 0;
        for (int num : A) {
            rightSum += num;
        }
        rightSum -= leftSum;
        int diff = Math.abs(leftSum - rightSum);
        for (int i = 1; i < A.length-1; i++) {
            leftSum += A[i];
            rightSum -= A[i];
            int currentDiff = Math.abs(leftSum - rightSum);
            if (currentDiff < diff) {
                diff = currentDiff;
            }
        }
        return diff;
    }
    
}