public class ReverseAString {
    public static void main(String[] args) {
        
    }

    public static String rev(int n) {
		String returnStr = "";
		String nString = Integer.toString(n);
		for (int i = nString.length()-1; i >= 0; i--) {
			returnStr += String.valueOf(String.valueOf(nString.charAt(i)));
		}
		if (n < 0) {
			return "-" + returnStr.substring(0, returnStr.length()-1);
		}
		return returnStr;
	}
}