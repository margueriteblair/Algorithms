public class LibraryFine {
    public static void main(String[] args) {
        
    }

    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if (y2 == y1) {
            if (m2 > m1) {
                return 0;
            } else if (m2 == m1) {
                if (d2 >= d1) {
                    return 0;
                } else {
                    return (d1-d2)*15;
                }
            } else {
                return (m1-m2)*500;
            }
        } else if (y1 > y2) {
            return 10000;
        } else {
            return 0;
        }
    }
}