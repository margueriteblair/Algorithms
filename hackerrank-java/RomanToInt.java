public class RomanToInt {
    public int romanToInt(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            int s1 = value(s.charAt(i));
            
            if (i + 1 < s.length()) {
                int s2 = value(s.charAt(i + 1));
 
                if (s1 >= s2) {
                    num = num + s1;
                } else {
                    num = num + s2 - s1;
                    i++;
                }
            }
            else {
                num = num + s1;
            }
        }
 
        return num;
        }
    
    public int value(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
}