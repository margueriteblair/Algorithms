import java.util.Arrays;

public class chunkymonkey {
    public static void main(String[] args) {
        chunk(new int[] {1, 2, 3, 4}, 2);
    }

    public static void chunk(int[] arr, int size) {
        int[] chunked = new int[(arr.length/size)];
        for (int i = 0; i < arr.length; i+=size) {
            System.out.println(Arrays.toString(Arrays.copyOfRange(arr, i, Math.min(arr.length, i+size))));
        }        
        System.out.println(Arrays.toString(chunked));
    }
}