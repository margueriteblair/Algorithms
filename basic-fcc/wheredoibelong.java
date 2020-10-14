public class wheredoibelong {
    public static void main(String[] args) {
        arrrayyss(new int[] {10, 20, 30, 40, 50}, 30);
        //[10, 20, 30, 40, 50], 35
    }

    public static void arrrayyss(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (n > arr[i] && n <= arr[i+1]) {
                System.out.println(i+1);
            }
        }
    }
}