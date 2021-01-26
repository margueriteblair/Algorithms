public class DuplicatePassports {
    
    public static void main(String[] args) {
        
    }

    static int[] findDuplicates(int[] arr1, int[] arr2) {
        Set<Integer> map = new HashSet<>();
        int dupCount = 0;
        List<Integer> result = new ArrayList<>();
        for (int num : arr1) {
          map.add(num);
        }
        for (int num : arr2) {
          if (map.contains(num)) {
            dupCount++;
            result.add(num);
          }
        }
    
        int[] result2 = new int[map.size()];
        int j = 0;
        for (Integer i : result) {
          result2[j++] = i;
        }
        return dupCount == 0 ? new int[0] : result2;
      }
}