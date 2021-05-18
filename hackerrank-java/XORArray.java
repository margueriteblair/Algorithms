public class XORArray {
    public static void main(String[] args) {
        
    }

    public int xorOperation(int n, int start) {
        int nums[] = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = start + (2*i);
        }
        System.out.println(Arrays.toString(nums));
        return 1;
    }
}