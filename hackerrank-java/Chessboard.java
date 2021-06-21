public class Chessboard {
    public static void main(String[] args) {
        
    }

    public boolean squareIsWhite(String coordinates) {
        char letter = coordinates.charAt(0);
        int space = Integer.valueOf(String.valueOf(coordinates.charAt(1)));
        if (letter == 'a' || letter == 'c' || letter == 'e' || letter == 'g') {
            if (space % 2 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            if (space % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}