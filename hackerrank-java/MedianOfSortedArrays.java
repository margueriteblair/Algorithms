public class MedianOfSortedArrays {
    public static void main(String[] args) {
        
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int min = Math.min(nums1[0], nums2[0]);
        int max = Math.max(nums1[nums1.length-1], nums2[nums2.length-1]);
        
        return (double)(min + max) / 2;
    }
}