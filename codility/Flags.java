public int solution(int[] A) {
    int[] peaks = new int[A.length];
    int nextPeak = A.length;
    peaks[A.length-1] = nextPeak;
    for (int i = A.length-2; i >0; i--) {
        if (A[i-1] < A[i] && A[i] > A[i+1]) {
            nextPeak = i;
        }
        peaks[i] = nextPeak;
    }
    peaks[0] = nextPeak;

    int current_guess = 0;
    int next_guess = 0;
    while (canPlaceFlags(peaks, next_guess)) {
        current_guess = next_guess;
        next_guess++;
    }
    return current_guess;
}

public boolean canPlaceFlags(int[] peaks, int flags) {
    int currentPosition = 1-flags;
    for (int i = 0; i < flags; i++) {
        if (currentPosition + flags > peaks.length -1 ) {
            return false;
        } else {
            currentPosition = peaks[currentPosition+flags];
        } 
    }
    return currentPosition < peaks.length;
}