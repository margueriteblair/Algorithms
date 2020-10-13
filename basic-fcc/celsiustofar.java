public class celsiustofar {
    public static void main(String[] args) {
        convert(-30);
    }

    public static double convert(double c) {
        double fTemp = c * ((double)9/5) + 32;
        System.out.println(fTemp);
        return fTemp;
    }
}