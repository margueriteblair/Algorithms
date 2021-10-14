package CrackingTheCodingInterview.Udemy;

public class BinarySearch {
    public static void main(String[] args) {
        
    }

    public static int binarySearch(int[] arr, int desired) {
        int left = 0;
        int right = arr.length-1;
        int mid = (left+right)/2;
        if (desired < mid) {

        } else if (desired > mid) {

        } else if (desired == mid) {
            return mid;
        }
    }
}