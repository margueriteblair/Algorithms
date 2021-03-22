public class ExcelColumnTitles {
    public static void main(String[] args) {
        
    }

    public String convertToTitle(int columnNumber) {
        String str = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
        String[] arr = str.split("");
        
        if (columnNumber <= 26) {
            System.out.println(701 % 26);
            return arr[columnNumber-1];
        } else {
            String ans = "";
            if (columnNumber % 26 != 0) {
                ans += convertToTitle(columnNumber/26);
                ans += convertToTitle(columnNumber%26);
            } else {
                ans += convertToTitle((columnNumber/26)-1);
                ans += 'Z';
            }
            return ans;
        }
    }
}