public class PartitioningDecimals {
    public static void main(String[] args) {
        
    }

    public int minPartitions(String n) {
        String elevens = "";
        for (int i = 0; i < n.length(); i++) {
            elevens += "1";
        }
        
        Long nInt = Long.valueOf(n);
        int eleventInt = Integer.valueOf(elevens);
        
        return nInt % eleventInt == 0 ? (int) nInt / eleventInt : (int) nInt / eleventInt + 1;
    }

    public int minPartitions2(String n) {
        int ans=0;
       //see hints for explaination
       char carr[]=n.toCharArray();
       for(int i=0;i<carr.length;i++){
          int digit=carr[i]-'0';
          if(digit>ans) ans=digit;
       }
      
          
        return ans;
     }
}