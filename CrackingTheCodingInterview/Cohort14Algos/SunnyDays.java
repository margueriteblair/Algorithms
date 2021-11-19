public class SunnyDays {
    public static void main(String[] args) {
        //https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem?isFullScreen=true
    }

    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
            int count = 0;
            for (int a = i; a <= j; a++) {
                String aStr = String.valueOf(a);
                String reversed = "";
                for (int b = aStr.length()-1; b >= 0; b--) {
                    reversed += String.valueOf(aStr.charAt(b));
                }
                int revInt = Integer.parseInt(reversed);
                if (((a - revInt) % k) == 0 ) {
                    count++;
                }
            }
            return count;
    
        }
}