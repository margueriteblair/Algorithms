package CrackingTheCodingInterview.Udemy;

public class WaterContainers {
    public static void main(String[] args) {
        
    }

    public int maxArea(int[] height) {
        int maxArea = Math.min(height[0], height[height.length-1])*height.length-1;
        int i = 0;
        int j = height[height.length-1];
        while (i < j) {
            if (height[i+1] > height[j-1]) {
                i++;
            } else {
                j++;
            }
            maxArea = Math.max(maxArea, Math.min(height[j], height[i])*(j-i));
        }
        return maxArea;
    }
}