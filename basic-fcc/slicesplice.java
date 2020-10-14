import java.util.Arrays;

public class slicesplice {
    public static void main(String[] args) {
        spliceAndSlice(new int[] {1, 2, 3}, new int[] {4, 5}, 1);
        //frankenSplice([1, 2, 3], [4, 5], 1)
        //frankenSplice([1, 2, 3], [4, 5, 6], 1);
    }

    public static void spliceAndSlice(int[] arr1, int[] arr2, int n) {
        int[] finalArr = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, finalArr, 0, n);
        System.arraycopy(arr2, 0, finalArr, n, arr2.length);
        System.arraycopy(arr1, n, finalArr, (n + arr2.length), arr1.length - 1);
        // Arrays.copyOfRange(arr1, 0, n) Arrays.copyOfRange(arr2, 0, arr2.length - 1);
        System.out.println(Arrays.toString(finalArr));
    }
}