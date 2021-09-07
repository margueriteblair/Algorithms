package CrackingTheCodingInterview.Udemy;

public class TrappingRainWater {
    public static void main(String[] args) {
        
    }

    public int trap(int[] height) {
        int totalWater = 0;
        for (int i = 0; i < height.length-1; i++) {
            int temp = 0;
            for (int j = i+1; j < height.length; j++) {
                if (height[j] < height[i]) {
                    temp += height[i]-height[j];
                } else {
                    totalWater += temp;
                }
            }
        }
        return totalWater;
    }
}