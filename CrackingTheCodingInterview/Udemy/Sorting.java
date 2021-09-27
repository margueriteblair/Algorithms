package CrackingTheCodingInterview.Udemy;

public class Sorting {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr);
    }
    //space O(1)
    //time O(N^2)

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int localMin = arr[i];
            int localMinIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < localMin) {
                    localMin = arr[j];
                    localMinIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = localMin;
            arr[localMinIndex] = tmp;
        }
        System.out.println(arr);
    }
}