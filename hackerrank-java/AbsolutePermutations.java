public class AbsolutePermutations {
    public static void main(String[] args) {
        
    }

    public static List<Integer> absolutePermutation(int n, int k) {
        List<Integer> permutation = new ArrayList<>();
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i-1] = i;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i] - (i+1)) != k) {
                break;
            }
        }
        return new ArrayList<>();
    }

}