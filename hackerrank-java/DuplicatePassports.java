public class DuplicatePassports {
    
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
    
        int[] result2 = new int[result.size()];
        int j = 0;
        for (Integer i : result) {
          result2[j++] = i;
        }
        return result2;
      }
    
      public static void main(String[] args) {
    
      }

      static int[] findDuplicates2(int[] arr1, int[] arr2) {
        // your code goes here
        int p1 = 0;
        int p2 = 0;
        List<Integer> answer = new ArrayList<>();
        
        while(p1 < arr1.length && p2 < arr2.length){
          int num1 = arr1[p1]; //1
          int num2 = arr2[p2]; //2
          
          if(num1 == num2){
            answer.add(num1);
            p1++;
          p2++; 
          }else if (num1 > num2){
            while((num1 > num2) && (p2 < arr2.length - 1)){
              p2++;
              num2 = arr2[p2];
            }
            if(num1 == num2) answer.add(num1);
            p1++; 
          }else if(num1 < num2){
            while((num1 < num2) && (p1 < arr1.length - 1)){
              p1++;
              num1 = arr1[p1]; //3
            }
            if(num1 == num2) answer.add(num1);
            p2++;
            
          }
          
        }
        
        int [] arrayAnswer = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++){
          arrayAnswer[i] = answer.get(i);
        }
     
        return arrayAnswer; 
       
      }
}