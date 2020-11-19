import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Cakewalk {
    private static List<Integer[]> permList = new ArrayList<>();

    public static void main(String[] args) {
        heapPermutation(new Integer[] {1, 3, 2}, 3, 3);
        for (Integer[] array : permList) {
            System.out.println(Arrays.toString(array));
        }
    }

    public static int run(Integer[] calorie) {
        heapPermutation(calorie, calorie.length, calorie.length);
        //loop through the subarrays and figure out which has the minimum
        
        List<Integer> nums = new ArrayList<>();
        for (int j = 0; j < permList.size(); j++) {
            int minMiles = 0;
            for (int i = 0; i < permList.get(j).length; i++) {
            System.out.println(Arrays.toString(permList.get(j)));
            minMiles += permList.get(j)[i] * Math.pow(2, i);
            }
            nums.add(minMiles);
        }
        Collections.sort(nums);
        // System.out.println(permList);
        return nums.get(0);
    }

    static void heapPermutation(Integer[] arr, Integer size, Integer n) {
        if (size == 1) {
            Integer[] copy = new Integer[arr.length];
            copy = arr.clone();
            permList.add(copy);
            // System.out.println(Arrays.toString(arr));
        }
        for (int i = 0; i < size; i++) {
            heapPermutation(arr, size-1, n);
            if (size % 2 == 0) {
            int temp = arr[0];
            arr[0] = arr[size-1];
            arr[size-1] = temp;
        } else {
            int temp = arr[i];
            arr[i] = arr[size-1];
            arr[size-1] = temp;
        }
        }
    }
}

//second cakewalk algo that relies on a simple array sort and then a sum lol
static long marcsCakewalk(Integer[] calorie) {
    Arrays.sort(calorie);
    System.out.println(Arrays.toString(calorie));
    int minMiles = 0;
    for (int i = calorie.length -1; i >= 0; i--) {
        System.out.println(calorie[i] + " " + (calorie.length-1-i));
        minMiles += calorie[i]*Math.pow(2, (calorie.length-1-i));
    }
    return minMiles;
}
