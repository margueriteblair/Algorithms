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
            }
            String temp = s.substring(0, s.length()-2);
            String[] arr = temp.split(":");
            String s2 = "";
            s2 += String.valueOf(Integer.parseInt(arr[0])+12);
            s2 += temp.substring(2);
            return s2;
        }
    }
}