package CrackingTheCodingInterview;

public class PowXN {
    public static void main(String[] args) {
        
    }

    public double myPow(double x, int n) {
        
        double expo = 1.0;
        if (n == 0) {
            return 1.0;
        }
        
        if (n % 2 == 0) {
            expo = myPow(x, n/2) * myPow(x, n/2);
        } else {
            expo = myPow(x, n/2) * myPow(x, n/2) * x;
        }
        return expo;
    }
}