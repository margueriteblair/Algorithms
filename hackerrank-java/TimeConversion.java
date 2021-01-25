public class TimeConversion {
    public static void main(String[] args) {
        timeConversion("12:45:54PM");
    }

    static String timeConversion(String s) {
        if (s.substring(s.length()-2).equals("AM")) {
            if (s.substring(0, 2).equals("12")) {
                String s2 = "00" + s.substring(2, s.length()-2);
                return s2;
            } else {
                return s.substring(0, s.length()-2);
            }
        } else {
            if (s.substring(0, 2).equals("12")) {
                return s.substring(0, s.length()-2);
            } else {
                return String.valueOf(Integer.parseInt(s.substring(0, 2))+12) + s.substring(2, s.length()-2);
            }
        }
    }
}