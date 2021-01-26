public class ACMTeam {
    public static void main(String[] args) {
        
    }
        static int[] acmTeam(String[] topic) {
            int count = 1;
            int max = Integer.MIN_VALUE;
            for(int i=0;i<topic.length-1;i++){
                for(int j=i+1;j<topic.length;j++){
                    int teamSum = 0;
                    for (int k = 0; k < topic[i].length(); k++) {
                        if (topic[i].charAt(k) == '1') teamSum++;
                        if (topic[j].charAt(k) == '1' && topic[i].charAt(k) == '0') teamSum++;
                    }
                    if (teamSum > max) {
                        max = teamSum;
                        count = 1;
                    } else if (teamSum == max) {
                        count++;
                    }
                }
            }
            int[] arr = {max,count};
            return arr;
        }