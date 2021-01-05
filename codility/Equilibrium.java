public class Equilibrium {
    public static void main(String[] args) {
        findingEquilibrium(new int[] {3,1,2,4,3});
    }

    public static int findingEquilibrium(int[] A) {
        if (A.length == 2) {
            return Math.abs(A[0] - A[1]);
        }
        int temp = 0;
        for (int num : A) {
            temp += num;
        }
        int min = temp;
        int left = 0;
        for (int i = 1; i < A.length; i++) {
            temp -= A[i-1];
            left += A[i-1];
            if (Math.abs(left-temp) < min) {
                min = Math.abs(left-temp);
            }
        }
        System.out.println(min);
        return min;
    }
}