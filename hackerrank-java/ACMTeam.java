public class ACMTeam {
    public static void main(String[] args) {
        
    }

        // Complete the acmTeam function below.
        int count = 1,max = Integer.MIN_VALUE;
        for(int i=0;i<topic.length-1;i++){
            for(int j=i+1;j<topic.length;j++){
                int temp = 0;
                for(int k = 0;k<topic[i].length();k++)
                    if(topic[i].charAt(k)=='1' || topic[j].charAt(k)=='1')
                        temp++;
                if(temp>max){
                    max = temp;
                    count = 1;
                }
                else if(temp == max)
                    count++;
            }
  
        }
        int[] ar = {max,count};
        return ar;

}