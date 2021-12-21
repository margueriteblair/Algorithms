public class TrappingRainWater2 {
    public static void main(String[] args) {
        
    }

    public int trap(int[] height) {
        int i = 0, j = height.length-1;
        int maxLeft = 0;
        int maxRight = 0;
        int totalWater = 0;
        
        while (i < j) {
            if (height[i] < height[j]) {
                if (height[i] > maxLeft) {
                    maxLeft = height[i];
                } else {
                    totalWater += maxLeft - height[i];
                }
                i++;
            } else {
                if (height[j] > maxRight) {
                    maxRight = height[j];
                } else {
                    totalWater += maxRight - height[j];
                }
                j--;
            }
        }
        return totalWater;
        
    }
}