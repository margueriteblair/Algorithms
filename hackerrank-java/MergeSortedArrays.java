public class MergeSortedArrays {
    public static void main(String[] args) {
        
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = nums1.length-1;
        for (int i = 0; i < nums2.length; i++) {
            nums1[j] = nums2[i];
            j--;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));  
    }
}