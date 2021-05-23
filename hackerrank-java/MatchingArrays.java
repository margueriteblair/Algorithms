public class MatchingArrays {
    public static void main(String[] args) {
        
    }

    public int minOperations(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (2 * i) + 1;
        }
        if (arr.length % 2 == 1) {
            return arr[(arr.length/2)]-1;
        } else {
            return arr[(arr.length/2)];
        }
    }
}