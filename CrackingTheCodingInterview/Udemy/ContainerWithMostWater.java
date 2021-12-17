class ContainerWithMostWater {
    public static void main(String[] args) {
        maxArea(new int[] {1,8,6,2,3,5,6});
    }

    public static int maxArea(int[] height) {
        int maxArea = Math.min(height[0], height[height.length-1])*height.length;
        int i = 0;
        int j = height.length-1;
        while (i < j) {
            if (height[i] < height[j]) {
                maxArea = Math.max(maxArea, height[i]*(j-i));
                i++;
            } else {
                maxArea = Math.max(maxArea, height[j]*(j-i));
                j--;
            }
        }
        return maxArea;
    }
}