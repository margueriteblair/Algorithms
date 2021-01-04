public class MaxMinSum {
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long max = 0;
        long min = 0;
        for (int i = 1; i < arr.length; i++) {
            max += arr[i];
        }
        for (int i = 0; i < arr.length-1; i++) {
            min += arr[i];
        }
        System.out.println(min + " " + max);

    }
}