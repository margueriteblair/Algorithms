public class LargestRectangle {
    public static void main(String[] args) {
        
    }

    static long largestRectangle(int[] h) {
        long maxArea = 0;
        for (int i = 0; i < h.length; i++) {
            long compareArea = 0;
            for (int j = 0; j < h.length; j++) {
                if (h[j] >= h[i]) {
                    compareArea += h[i];
                }
            }
            if (compareArea > maxArea) {
                maxArea = compareArea;
            }
            
        }
        return maxArea;
    }
}