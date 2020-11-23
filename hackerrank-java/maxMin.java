public class maxMin {
    public static void main(String[] args) {
        
    }
    static int maxMin(int k, int[] arr) {
        int[] subarr = new int[k];
        Arrays.sort(arr);
        int maxMin = arr[k-1]-arr[0];
        for (int i = 0; i <= arr.length-k; i++) {
            if (arr[i+k-1]-arr[i] < maxMin) {
                maxMin = arr[i+k-1]-arr[i];
            } 
        }
        return maxMin;

    }
}