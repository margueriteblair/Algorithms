package CrackingTheCodingInterview.Udemy;

public class ShiftedBinarySearch {
    public static int shiftedBinarySearch(int[] array, int target) {
        int left = 0;
            int right = array.length-1;
            while (left <= right) {
                
                int mid = (left+right)/2;
                if (array[mid] == target) return mid;
                if (array[left] <= array[mid]) { //THIS SIDE IS ORDERED
                    if (target < array[mid] && target >= array[left]) {
                        right = mid-1;
                } else {
                        left = mid + 1;
                }
            } else {
                    if (target > array[mid] && target <= array[right]) {
                        left = mid+1;
                    } else {
                        right = mid-1;
                    }
                }
      }
            return -1;
    }
}