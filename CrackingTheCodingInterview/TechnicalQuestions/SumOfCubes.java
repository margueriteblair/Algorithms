class SubOfCubes {

    public static void main(String[] args) {
        sumCubes();
    }

    static void sumCubes() {
        int limit = 1000;
        for (int a = 1; a <= limit; a++) {
            for (int b = 1; b <= limit; b++) {
                for (int c = 1; c <= limit; c++) {
                    for (int d = 1; d <= limit; d++) {
                        if ((Math.pow(a, 3)+Math.pow(b, 3)) == (Math.pow(c, 3)+Math.pow(d, 3))) {
                            System.out.println("a: " + a + " b: " + b + " c: " + c + " d: " + d);                    }
                    }
                }
            }
        }
    }
}