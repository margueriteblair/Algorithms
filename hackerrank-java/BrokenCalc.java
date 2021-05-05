public class BrokenCalc {
    public int brokenCalc(int X, int Y) {
        int count = 0;
        if (Y <= X) {
            return X-Y;
        } else {
            while (X < Y) {
                X *= 2;
                count++;
            }
            return count + X-Y;
        }
    }
}