import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        String[] strArr = {"a", "b", "c"};
        int[] intArr = new int[10];
        for (int i = 0; i < 10; i++) {
            intArr[i] = i;
        }
        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(intArr));
    }
}