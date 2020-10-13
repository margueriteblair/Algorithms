import java.util.Arrays;

public class reversestring {
    public static void main(String[] args) {
        reverse("Hello world");
        reverse("Try me, bitch!");
    }

    public static void reverse(String str) {
        // str.split(" ");
        String[] strArr = str.split("");
        String finalStr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            // System.out.println(strArr[i]);
            finalStr += strArr[i];
        }
        System.out.println(finalStr);
        // return newStr;
    }
}