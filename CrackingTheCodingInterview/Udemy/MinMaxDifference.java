public class MinMaxDifference {
    public static void main(String[] args) {
        
    }

    public static int differenceMaxMin(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-1]-arr[0];
	}
}