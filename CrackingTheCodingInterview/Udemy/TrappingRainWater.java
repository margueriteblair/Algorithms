package CrackingTheCodingInterview.Udemy;

public class TrappingRainWater {
    public static void main(String[] args) {
        
    }

    public int trap(int[] height) {
        int totalWater = 0;
        for (int i = 0; i < height.length-1; i++) {
            
            int left = 0;
            for (int j = 0; j < i; j++) {
                left = Math.max(left, height[j]);
            }
            int right = 0;
            for (int j = i+1; j < height.length; j++) {
                right = Math.max(height[j], right);
            }
            if ((Math.min(right, left)-height[i]) < 0) {
                totalWater += 0;
            } else {
                totalWater += (Math.min(right, left)-height[i]);
            }
            
        }
        return totalWater;
    }

    public int trap2(int[] height) {
        int i = 0;
        int j = height.length-1;
        int totalWater = 0;
        int maxLeft = 0;
        int maxRight = 0;
        
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