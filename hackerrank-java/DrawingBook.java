public class Solution {

    static int pageCount(int n, int p) {
        int fromBack = 0;
        int fromFront = 0;
        //evens on left, odds on right
        int curr = 1;
        while (curr < p) {
            if (curr == p - 1 && p % 2 == 1) {
                break;
            } else if (curr == p+1 && p % 2 == 0) {
                fromBack++;
                break;
            } else {
                curr += 2;
                fromFront++;
            }
        }
        curr = n;
        while (curr > p) {
            if (curr == p+1 && p % 2 == 1) {
                fromBack++;
                break;
            } else if (curr == p+1 && p % 2 == 0) {
                break;
            } else {
                curr -= 2;
                fromBack++;
            }

        }
        
        
        System.out.println("Front: " + fromFront + " Back: " + fromBack);
        return Math.min(fromBack, fromFront);

    }