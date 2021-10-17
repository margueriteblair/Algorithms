package CrackingTheCodingInterview.Udemy;

import java.util.Arrays;

public class FirstAndLastPos {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[] {1,1,2,3,4,5,5,5,7,8}, 5)));
    }

    public static int binarySearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = (left+right)/2;
            int found = arr[mid];
            if (found == target) {
                return mid;
            } else if (found > target) {
                right = mid-1;
            } else if (found < target) {
                left = mid+1;
            }
        }
        return -1;
    }

    public static int[] searchRange(int[] arr, int target) {
        int[] res = new int[2];
        if (arr.length == 0) {
            res[0] = -1;
            res[1] = -1;
            return res;
        }
        int firstPos = binarySearch(arr, 0, arr.length-1, target);
        if (firstPos == -1) {
            res[0] = -1;
            res[1] = -1;
            return res;
        }
        int startPos = firstPos;
        int endPos = firstPos;
        int temp1 = 0;
        int temp2 = 0;
        while (startPos != -1) {
            temp1 = startPos;
            startPos = binarySearch(arr, 0, startPos-1, target);
        }
        startPos = temp1;

        while (endPos != -1) {
            temp2 = endPos;
            endPos = binarySearch(arr, endPos+1, arr.length-1, target);
        }
        endPos = temp2;
        res[0] = startPos;
        res[1] = endPos;
        return res;
    }
}