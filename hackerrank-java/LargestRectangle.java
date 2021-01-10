import java.math.*;
import java.util.*;

public class LargestRectangle {
    public static void main(String[] args) {
        int[] testArr = {8979, 4570 ,6436 ,5083 ,7780 ,3269 ,5400, 7579, 2324, 2116};
        // Arrays.sort(testArr);
        System.out.println(largestRectangle(testArr));
    }

    static long largestRectangle(int[] h) {
        long maxArea = 0;
        for (int i = 0; i < h.length; i++) {
            int curr = h[i];
            long compareArea = 0;
            int j = i;
            while (j < h.length && h[j] >= curr) {
                compareArea += h[i];
                j++;
            }
            j = i-1;
            while (j >= 0 && h[j] >= curr) {
                compareArea += h[i];
                j--;
            }
            if (compareArea > maxArea) {
                maxArea = compareArea;
            }
        }
        return maxArea;
    }
}