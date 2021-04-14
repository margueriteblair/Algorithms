public class ContainersWithWater {
    public int maxArea(int[] height) {
        int maxWater = 0;
        for (int i = 0; i < height.length-1; i++) {
            for (int j = i+1; j < height.length; j++) {
                int lower = Math.min(height[i], height[j]);
                if ((j-i)*lower > maxWater) {
                    maxWater = (j-i)*lower;
                }
            }
        }
        return maxWater;
    }
}