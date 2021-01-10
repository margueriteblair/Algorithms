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

    static long largestRectangle2(int[] h) {
        // int maxArea = 0;
        Arrays.sort(h);
        long maxArea = 0;
        for (int i = 0; i < h.length; i++) {
            int compareArea = h[i]*(h.length-i);
            System.out.println(h[i] + " " + (h.length-i));
            if (compareArea > maxArea) {
                maxArea = compareArea;
            }
        }
        return maxArea;
    }
}