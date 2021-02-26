public class RomanToInt {
    public int romanToInt(String s) {
        int num = 0;
        if (s.charAt(0) == 'I') num++;
        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i) == 'M' && s.charAt(i-1) != 'C') {
                num += 1000;
            } else if (s.charAt(i) == 'M' && s.charAt(i-1) == 'C') {
                num += 900;
            } else if (s.charAt(i) == 'D' && s.charAt(i-1) != 'C') {
                num += 500;
            } else if (s.charAt(i) == 'D' && s.charAt(i-1) == 'C') {
                num += 400;
            } else if (s.charAt(i) == 'L' && s.charAt(i-1) != 'X') {
                num += 50;
            } else if (s.charAt(i) == 'L' && s.charAt(i-1) == 'X') {
                num += 40;
            } else if (s.charAt(i) == 'C' && s.charAt(i-1) != 'X') {
                num += 100;
            } else if (s.charAt(i) == 'C' && s.charAt(i-1) == 'X') {
                num += 90;
            } else if (s.charAt(i) == 'V' && s.charAt(i-1) != 'I') {
                num += 5;
            } else if (s.charAt(i) == 'V' && s.charAt(i-1) == 'I') {
                num += 4;
            } else if (s.charAt(i) == 'X' && s.charAt(i-1) != 'I') {
                num += 10;
            } else if (s.charAt(i) == 'X' && s.charAt(i-1) == 'I') {
                num += 9;
            } else if (s.charAt(i) == 'I' && i+1 < s.length() && s.charAt(i+1) == 'I') {
                num +=1;
            } else if (s.charAt(i-1) == 'I') {
                num +=1;
            } else {
                num++;
            }
            }
        return num;
        }
}