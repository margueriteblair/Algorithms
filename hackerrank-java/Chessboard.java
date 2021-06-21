public class Chessboard {
    public static void main(String[] args) {
        
    }

    public boolean squareIsWhite(String coordinates) {
        char letter = coordinates.charAt(0);
        int space = Integer.valueOf(String.valueOf(coordinates.charAt(1)));
        System.out.println(letter + " " + space);
        if (letter == 'a' || letter == 'c' || letter == 'e' || letter == 'g') {
            return (space % 2 == 0) ? true : false;
        } else {
            return (space % 2 == 0) ? false : true;
        }
    }
}