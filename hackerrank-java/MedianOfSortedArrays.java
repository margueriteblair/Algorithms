public class MedianOfSortedArrays {
    public static void main(String[] args) {
        
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int min = 0;
        int max = 0;
        
        if (nums1.length >0 && nums2.length >0) {
            min = Math.min(nums1[0], nums2[0]);
            max = Math.max(nums1[nums1.length-1], nums2[nums2.length-1]);
        } else if (nums1.length == 0) {
            min = nums2[0];
            max = nums2[nums2.length-1];
        } else if (nums2.length == 0) {
            min = nums1[0];
            max = nums1[nums1.length-1];
        }
        return (double)(min + max) / 2;
    }
}