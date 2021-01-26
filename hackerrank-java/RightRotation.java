public class RightRotation {
    public static void main(String[] args) {
        
    }

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] b = new int[a.length];
        int[] q = new int[queries.length];
        for (int i = 0; i < a.length; i++) {
            b[(i+k)%a.length] = a[i];
        }
        
        for (int i = 0; i < queries.length; i++) {
            q[i] = b[queries[i]];
        }
        return q;
    }
}