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

    public int maxArea2(int[] height) {
        int i = 0;
        int j = height.length-1;
        int maxWater = 0;
        while (i < j) {
            if (height[i] < height[j]) {
                maxWater = Math.max(maxWater, (j-i)*height[i]);
                while(i<j && height[i+1]<=height[i])
                    i++;
                i++;
            } else {
                maxWater = Math.max(maxWater, (j-1)*height[j]);
                while(i<j && height[j-1]<=height[j])
                    j--;
                j--;
            }
        }
        return maxWater;
    }
}