public class CharacterArray {
    public static void main(String[] args) {
        
    }

    static String getShortestUniqueSubstring(char[] arr, String str) {
    
        //Explore 30 day 
        // Medium
        // Sliding Window Technique
        
        // 
        
        https://www.teamblind.com/post/New-Year-Gift---Curated-List-of-Top-100-LeetCode-Questions-to-Save-Your-Time-OaM1orEU
        
        
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
          if (!charMap.containsKey(arr[i])) {
            charMap.put(arr[i], 1);
          } else {
            charMap.put(arr[i], charMap.get(arr[i])+1);
          }
        }
        
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
          Map<Character, Integer> charMap2 = new HashMap<>(charMap);
          System.out.println(charMap2);
          for (int j = i; j < str.length(); j++) {
            if (charMap2.containsKey(str.charAt(j))) {
            charMap2.put(str.charAt(j), charMap2.get(str.charAt(j))-1);
              if (charMap2.get(str.charAt(j)) == 0) charMap2.remove(str.charAt(j));
            }
            
            if (charMap2.isEmpty()) {
              if (str.substring(i, j).length() < temp.length() && !temp.equals("")) {
                temp = str.substring(i, j);
              } else if (temp.equals("")) temp=str.substring(i, j);
              break;
            }
          }
        }
        
        return temp;
      }
}