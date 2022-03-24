import java.util.Arrays;

public class arrayMultiples {
    public static void main(String[] args) {
        multiples(7, 5);
    }

    public static void multiples(int num, int length) {
        int[] arr = new int[length];
        for (int i = 1; i <= length; i++) {
            arr[i-1] = i*num;
        }

        System.out.println(Arrays.toString(arr));
    }
}