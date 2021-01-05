import java.util.Arrays;

public class PermMissingElem {
    public static void main(String[] args) {
        missing(new int[] {2, 4, 1, 3, 6});
    }
    public static int missing(int[] A) {
        Arrays.sort(A);
        if (A.length == 0) return 0;
        int missing = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != i+1) {
                missing = i+1;
            }
        }
        return missing;
    }

}