public class SqRt {
    public static void main(String[] args) {
        
    }

    public int mySqrt(int x) {
        if (x == 1) return 1;
        int end = 0;
        for (int i = 0; i <= x/2; i++) {
            if (i*i <= x && (i+1)*(i+1) > x) {
                end = i;
                return i;
            }
        }
        return end;
    }
}