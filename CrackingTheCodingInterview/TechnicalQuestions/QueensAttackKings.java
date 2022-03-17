package CrackingTheCodingInterview.TechnicalQuestions;

public class QueensAttackKings {
    public static void main(String[] args) {
        
    }

    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[][] seen = new boolean[8][8]; //boolean of all the queens on the board
        for (int[] queen : queens) {
            seen[queen[0]][queen[1]] = true;
        }
        
        int[] directions = {-1, 0, 1};
        for (int dirX : directions) {
            for (int dirY : directions) {
                //going over all x and y directions
                if (dirX == 0 && dirY == 0) {
                    continue;
                }
                
                int x = king[0];
                int y = king[1];
                
                while (x + dirX >= 0 && dirX + x < 8 && y + dirY < 8 && dirY + y >= 0) {
                    x += dirX;
                    y += dirY;
                    if (seen[x][y]) {
                        result.add(Arrays.asList(x, y));
                        break;
                    }
                }
            }
        } 
        return result;
    }
}