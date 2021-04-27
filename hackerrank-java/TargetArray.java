public class TargetArray {
    public static void main(String[] args) {
        
    }

    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> al = new ArrayList<>();
        int i = 0;
        int j = 0;
        int indexInt = 0;
        while(i < index.length){
            al.add(index[i], nums[i]);
            i++;
        }
        int[] answer = convertToArray(al);
        return answer;
    }
    
    private int[] convertToArray(ArrayList<Integer> al)
    {
        int[] array = new int[al.size()];
        for(int i = 0; i < array.length; i++) {
            array[i] = al.get(i).intValue();
        }
        return array;
    }

    public int[] createTargetArray3(int[] nums, int[] index) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int j : nums) {
            list.add(index[count], j);
            count++;
        }
        System.out.println(list);
        int[] arr = new int[list.size()];
        for (int k = 0; k < arr.length; k++) {
            arr[k] = list.get(k);
        }
        return arr;
    }
}