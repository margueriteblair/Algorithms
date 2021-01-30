public class Index {
    public static void main(String[] args) {
        
    }

    static int introTutorial(int V, int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == V) {
                index = i;
                return i;
            }
        }
        return index;
    }
}