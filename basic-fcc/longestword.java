public class longestword {
    public static void main(String[] args) {
        longest("The quick brown fox jumped over the rabbit");
        longest("What is the average airspeed velocity of an unladen swallow");
    }

    public static void longest(String str) {
        String[] strArr = str.split(" ");
        int longest = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() > longest) {
                longest = strArr[i].length();
            }
        }

        System.out.println(longest);
    }
}