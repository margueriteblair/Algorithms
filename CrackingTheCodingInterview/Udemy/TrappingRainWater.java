package CrackingTheCodingInterview.Udemy;

public class TrappingRainWater {
    public static void main(String[] args) {
        
    }

    public int trap(int[] height) {
        int totalWater = 0;
        for (int i = 0; i < height.length-1; i++) {
            
            int maxHeightLeft = 0;
            for (int j = 0; j < i; j++) {
                if (height[j] > maxHeightLeft) {
                    maxHeightLeft = height[j];
                }
            }
            int maxHeightRight = 0;
            for (int j = i+1; j < height.length; j++) {
                if (height[j] > maxHeightRight) {
                    maxHeightRight = height[j];
                }
            }
            totalWater += (Math.min(maxHeightRight, maxHeightLeft)-height[i]);
        }
        return totalWater;
    }
}