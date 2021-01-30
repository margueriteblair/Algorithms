public class TripletCount {
    public static void main(String[] args) {
        
    }

    static long triplets(int[] a, int[] b, int[] c) {
        long tripletCount = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                for (int k = 0; k < c.length; k++) {
                    int[] arr = {a[i], b[j], c[k]};
                    if (isTriplet(arr)) {
                        tripletCount++;
                    }
                }
            }
        }
        return tripletCount; 
    }
    
    public static boolean isTriplet(int[] array) {
        if (array[0] <= array[1] && array[1] >= array[2]) {
            return true;
        }
        
        return false;
    }
}