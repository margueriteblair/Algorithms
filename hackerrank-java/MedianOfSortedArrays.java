public class MedianOfSortedArrays {
    public static void main(String[] args) {
        
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> arrList = new ArrayList<>();
        
        
        for (int i = 0; i < nums1.length; i++) {
            arrList.add(nums1[i]);
        }
    
        for (int i = 0; i < nums2.length; i++) {
            arrList.add(nums2[i]);
        }
        
        Collections.sort(arrList);
        
//         int i = 0;
//         int j = arrList.size()-1;
        
//         whie (j > i) {
            
//         }
        if (arrList.size() % 2 == 1) {
            return arrList.get(arrList.size() / 2);
        } else {
            double a = arrList.get(arrList.size()/2 - 1);
            double b = arrList.get(arrList.size()/2);
            System.out.println(a + " " + b);
            return (double) (a + b) / 2;
        }
    }s
}