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
}