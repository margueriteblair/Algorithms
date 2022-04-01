package CrackingTheCodingInterview;

public class PowXN {
    public static void main(String[] args) {
        
    }

    public double myPow(double x, int n) {
        double expo = 1;
        for (int i = 0; i < n; i++) {
            expo *= x;
        }
        
        return expo;
    }
}