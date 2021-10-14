package CrackingTheCodingInterview.Udemy;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] {1,2,3,4,5}, 2));
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;
        
        while (left != right) {
            int mid = (left+right)/2;
            if (target < arr[mid]) {
                right = mid-1;
            } else if (target > arr[mid]) {
                left = mid+1;
            } else if (target == arr[mid]) {
                return mid;
            }
        }

        return -1;
    }
}