public class BrokenCalc {
    public int brokenCalc(int X, int Y) {
        int count = 0;
        if (Y <= X) {
            return X-Y;
        } else {
            while (X < Y) {
                count++;
                if (Y % 2 == 0) {
                    Y = Y/2;
                } else {
                    Y++;
                }
            }
            return count + X - Y;
        }
    }
}