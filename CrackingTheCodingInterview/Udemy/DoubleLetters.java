public class DoubleLetters {
    public static void main(String[] args) {
        
    }

    public static boolean doubleLetters(String word) {
		for (int i=0;i<word.length()-1;i++) {
			if (word.charAt(i)==word.charAt(i+1)) {
				return true;
            }
        }
		return false;
	}
}