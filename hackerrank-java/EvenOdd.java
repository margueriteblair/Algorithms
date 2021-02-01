public class EvenOdd {
    public static void main(String[] args) {
        evenOrOdd(new int[] {1,2,3,4,5,6,7,8,9,10});
    }

    public static void evenOrOdd(int[] arr) {
        int rEven = arr.length > 0 ? arr[0] : 0;
        int rOdd = arr.length > 0 ? arr[1] : 0;
        boolean multiply1 = true;
        for (int i = 2; i < arr.length; i+=2) {
            if (multiply1) {
                rEven *= arr[i];
            } else {
                rEven += arr[i];
            }
            multiply1 = !multiply1;
        }
        boolean multiply2 = true;
        for (int i = 3; i < arr.length; i+=2) {
            if (multiply2) {
                rOdd *= arr[i];
            } else {
                rOdd += arr[i];
            }
            System.out.println(arr[i]);
            multiply2 = !multiply2;
        }

        if (rEven % 2 > rOdd % 2) {
            System.out.println("EVEN");
        } else if (rEven % 2 < rOdd % 2) {
            System.out.println("ODD");
        } else {
            System.out.println("NEUTRAL");
        }

    }
}