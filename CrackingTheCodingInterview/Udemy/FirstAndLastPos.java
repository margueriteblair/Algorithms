package CrackingTheCodingInterview.Udemy;

public class FirstAndLastPos {
    public static void main(String[] args) {
        
    }

    public static int binarySearch(int[] arr, int left, int right, int target) {

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
        int temp1, temp2;
    }
}