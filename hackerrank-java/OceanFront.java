import java.util.List;

public class OceanFront {
    public static void main(String[] args) {
        oceanFronts(new int[] {4, 3, 2, 3, 1});
    }

    public static List<Integer> oceanFronts(int[] arr) {
        int max = 0;
        List<Integer> oceanNums = new ArrayList<>();
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] > max) {
                oceanNums.add(i);
                max = arr[i];
            }
        }
        return oceanNums;
    }
    
}