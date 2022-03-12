package CrackingTheCodingInterview.TechnicalQuestions;

public class TrappingRainwater {
    public static void main(String[] args) {
        
    }

    public static int waterArea(int[] heights) {
        // Write your code here.
            int totalWater = 0;
            for (int i = 0; i < heights.length-1; i++) {
                int left = 0;
                for (int j = 0; j < i; j++) {
                    left = Math.max(left, heights[j]);
                }
                
                int right = 0;
                for (int j = i+1; j < heights.length; j++) {
                    right = Math.max(heights[j], right);
                }
                
                if (Math.min(left, right) - heights[i] > 0) {
                    totalWater += Math.min(left, right) - heights[i];
                }
                
            }
        return totalWater;
      }
}