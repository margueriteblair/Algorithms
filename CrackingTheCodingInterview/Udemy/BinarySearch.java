package CrackingTheCodingInterview.Udemy;

public class BinarySearch {
    public static void main(String[] args) {
        
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;
        int mid = (left+right)/2;
        while (left != right) {
            if (target < mid) {
                right = mid-1;
            } else if (target > mid) {
                left = mid+1;
            } else if (target == mid) {
                return mid;
            }
        }

        return -1;
    }
}