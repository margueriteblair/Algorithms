
import java.util.*;

public class reverseList {
    public static void main(String[] args) {
        System.out.println(reverse(List.of(15, 22, 11, 9, 4)));
    }

    public static List<Integer> reverse(List<Integer> arr) {
        Integer[] intArr = arr.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(intArr));
        for (int i = 0; i < intArr.length/2; i++) {
            int temp = intArr[i];
            intArr[i] = intArr[intArr.length-1-i];
            intArr[intArr.length-1-i] = temp;
        }
        // System.out.println(Arrays.toString(intArr));

        return Arrays.asList(intArr);
        
    }
}