import java.util.Arrays;

public class titlecase {
    public static void main(String[] args) {
        titleCase("I'm a little tea pot");
    }

    public static String[] titleCase(String str) {
        String[] strArr = str.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = strArr[i].toLowerCase();
            strArr[i] = strArr[i].substring(0, 1).toUpperCase() + strArr[i].substring(1);
            // System.out.println(strArr);
        }
        System.out.println(String.join(" ", strArr));
        return strArr;
    }
}