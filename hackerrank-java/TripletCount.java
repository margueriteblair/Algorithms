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

    static long triplets2(int[] a, int[] b, int[] c) {
        Arrays.sort(a);
       a=Arrays.stream(a).distinct().toArray();
       Arrays.sort(b);
       b=Arrays.stream(b).distinct().toArray();
       Arrays.sort(c);
       c=Arrays.stream(c).distinct().toArray();
       int aIndex = 0;
       int bIndex = 0;
       int cIndex = 0;
       long result = 0;

       while(bIndex<b.length){
           while(aIndex<a.length && a[aIndex]<=b[bIndex])
               aIndex++;

           while(cIndex<c.length && c[cIndex]<=b[bIndex])
               cIndex++;
                       
           // you should convert int to long first, 
           // avoid int overflow and lead to fail the test case 4
           result += ((long)aIndex)*((long)cIndex);
           bIndex++;
       }
       return result;
   }
}