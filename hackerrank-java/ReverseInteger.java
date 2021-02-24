public class ReverseInteger {
    public int reverse(int x) {
        String str = String.valueOf(x);
        String intStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            intStr += str.charAt(i);
        }
        if (intStr.charAt(intStr.length()-1) == '-') {
            return Integer.parseInt(intStr.substring(0, intStr.length()-1))*-1;
        }
        return Integer.parseInt(intStr);
    }
}