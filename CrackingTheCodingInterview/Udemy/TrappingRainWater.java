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
}