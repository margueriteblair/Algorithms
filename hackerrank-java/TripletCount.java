public class TripletCount {
    public static void main(String[] args) {
        
    }
    static long triplets(int[] a, int[] b, int[] c) {
        // long tripletCount = 0;
        Set<int[]> tripletSet = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                for (int k = 0; k < c.length; k++) {
                    int[] arr = {a[i], b[j], c[k]};
                    if (isTriplet(arr, tripletSet)) {
                        tripletSet.add(arr);
                    }
                }
            }
        }
        return tripletSet.size(); 
    }
    
    public static boolean isTriplet(int[] array, Set<int[]> hash) {
        if (array[0] <= array[1] && array[1] >= array[2]) {
            for (int[] arr : hash) {
                if (arr[0] == array[0] && arr[1] == array[1] && arr[2] == array[2]) {
                    return false;
                }
            }
            return true;
        }
        
        return false;
    }
}