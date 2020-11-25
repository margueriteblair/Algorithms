public class DArray {
    public static void main(String[] args) {
       System.out.println(hasZero(0));
       System.out.println(hasZero(88));

    }

    static boolean hasZero(int num) {
        int rem;
        if (num == 0) return true;
        while (num > 0) {
            rem = num % 10;
            if (rem == 0)
                return true;
            num = num / 10;
        }
        return false;
    }
}

public static boolean canWin(int leap, int[] game) {
    // Return true if you can win the game; otherwise, return false.
    return isSolvable(leap, game, 0);
}
private static boolean isSolvable(int leap, int[] game, int i) {
// Base Cases
if (i >= game.length) {
    return true;
} else if (i < 0 || game[i] == 1) {
    return false;
}
        
game[i] = 1; // marks as visited

// Recursive Cases
return isSolvable(leap, game, i + leap) || 
       isSolvable(leap, game, i + 1) || 
       isSolvable(leap, game, i - 1);
}