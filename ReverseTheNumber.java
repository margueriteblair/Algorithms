public class ReverseTheNumber {
    public static void main(String[] args) {
        System.out.println(rev(1234));
    }

    public static String rev(int n) {
        String nString = Integer.toString(n);
        String result = ""; // "4" "43" "432" "4321"
        //-1234, "-1234" '4321-'
        for (int i = nString.length()-1; i >= 0; i--) {
            result += String.valueOf(nString.charAt(i)); //nstring[i];
        }

        if (n < 0) {
            //"4321-"
            return result.substring(0, result.length()-1);
        }
        return result;
    }
}