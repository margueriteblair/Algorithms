package CrackingTheCodingInterview.TechnicalQuestions;

public class LongestLineInMatrix {
    public int longestLine(int[][] mat) {
        int longest = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    //now we need to start some type of search
                    int[] directions = {-1, 0, 1};
                    
                    for (int dx : directions) {
                        for (int dy : directions) {
                            int currLongest = 1;
                            longest = Math.max(currLongest, longest);
                            if (dx == 0 && dy == 0) continue;
                            
                            int x = i;
                            int y = j;
                            
                            while (x + dx >= 0 && x + dx < mat.length && y + dy >= 0 && y + dy < mat[0].length) {
                                x += dx;
                                y += dy;
                                if (mat[x][y] == 1) {
                                    currLongest++;
                                    longest = Math.max(longest, currLongest);
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                    
                }
            }
        }
        return longest;
    }

    public int longestLine2(int[][] mat) {
        if (mat.length == 0) return 0;
        int ones = 0;
        int[][][] dp = new int[mat.length][mat[0].length][4];
        for (int i = 0; i < mat.length; i++) {
            for (int j= 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    dp[i][j][0] = j > 0 ? dp[i][j-1][0] + 1 : 1;
                    dp[i][j][1] = i > 0 ? dp[i-1][j][1] + 1 : 1;
                    dp[i][j][2] = (i > 0 && j > 0) ? dp[i-1][j-1][2] + 1 : 1;
                    dp[i][j][3] = (i > 0 && j < mat[0].length-1) ? dp[i-1][j+1][3] + 1 : 1;
                    
                    ones =
              Math.max(ones,Math.max(Math.max(dp[i][j][0], dp[i][j][1]), Math.max(dp[i][j][2], dp[i][j][3])));
                }
            }
        }
        return ones;
    }
}