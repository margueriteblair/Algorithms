public class MatchingArrays {
    public static void main(String[] args) {
        
    }

    public int minOperations(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (2 * i) + 1;
        }
        int numOps = 0;
        if (arr.length % 2 == 1) {
            return arr[0] - arr[arr.length/2+1]
        }
        return 1;
        
    }
}