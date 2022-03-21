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
}