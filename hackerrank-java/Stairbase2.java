public class Stairbase2 {
    public static void main(String[] args) {
        
    }

    public int climbStairs(int n) {
        int[] arr = new int[n];
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        
        if (n == 3) {
            return 3;
        }
        
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        
        for (int i = 3; i < n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println(Arrays.toString(arr));
        return arr[n-1];
    }
}