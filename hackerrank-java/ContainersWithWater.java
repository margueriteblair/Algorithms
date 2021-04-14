public class ContainersWithWater {
    public int maxArea(int[] height) {
        int maxAmount = 0;
        for (int i = 0; i < height.length; i++) {
            // if ((height.length-(i+1))*height[i] > maxAmount) {
            for (int j = i+1; j < height.length-1; j++) {
                if (height[j] <= height[i] && (j-i)*height[i] > maxAmount){
                    maxAmount = ((j-i)*height[i]);
                }
            }
        }
        return maxAmount;
    }
}