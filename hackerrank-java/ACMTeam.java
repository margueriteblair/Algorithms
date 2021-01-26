public class ACMTeam {
    public static void main(String[] args) {
        
    }

        // Complete the acmTeam function below.
        static int[] acmTeam(String[] topic) {
            int[] result = new int[2];
            int max = 0;
            int numTeams = 0;
            List<int[]> teams = new ArrayList<>();
            for (int i = 0; i < topic.length-1; i++) {
                for (int j = i+1; j < topic.length; j++) {
                    int[] pair = new int[2];
                    pair[0] = i;
                    pair[1] = j;
                    teams.add(pair);
                }
            }
            for (int[] pair : teams) {
                int teamSum = 0;
                for (int k = 0; k < topic[pair[0]].length(); k++) {
                    if (topic[pair[0]].charAt(k) == '1') {
                        teamSum++;
                    }
                    if (topic[pair[1]].charAt(k) =='1' && topic[pair[0]].charAt(k) == '0') {
                        teamSum++;
                    }
                }
                System.out.println(teamSum);
                if (teamSum == topic[0].length()) {
                    numTeams++;
                }
            }
            result[0] = topic[0].length();
            result[1] = numTeams;
            return result;       
        }
}