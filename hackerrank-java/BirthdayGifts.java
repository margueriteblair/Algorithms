public class BirthdayGifts {
    public static void main(String[] args) {
        
    }

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        long minWCost = Math.min(wc, bc+z);
        long minBCost = Math.min(bc, wc+z);
        
        return (minWCost*w)+(minBCost*b);

    }
}