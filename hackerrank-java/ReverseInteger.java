public class ReverseInteger {
    public int reverse(int x) {
        String str = String.valueOf(x);
        String intStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            intStr += str.charAt(i);
        }
        
        return Integer.parseInt(intStr);
    }
}