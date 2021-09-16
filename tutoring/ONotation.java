package tutoring;

import java.util.ArrayList;
import java.util.List;

public class ONotation {
    public static void main(String[] args) {
        
    }

    public static int example(int e) {
        //O(1)
        //doesn't matter how large e scales, we'll always return a constant
        return 1;
    } 

    public static int array(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        return res;
        //nums = N
        //O(N)
    }

    public static List<String> arrays2(String str) {
        //O(N^2)
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                //O((n^2))
            }
        }
        return list;
    }
}