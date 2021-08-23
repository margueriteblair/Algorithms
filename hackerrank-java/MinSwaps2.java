public class MinSwaps2 {
    public static void main(String[] args) {
        minimumSwaps(new int[] {7,1,3,2,4,6,5});
    }

    static int minimumSwaps(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != (i+1)) {
                int j = i;
                while (arr[j] != (i+1)) {
                    j++;
                }
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                count++;
            }
        }
        return count;
    }
}