public class PlusMinus {
    
    static void plusMinus(int[] arr) {
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) pos++;
            else if (arr[i] < 0) neg++;
            else zero++;
        }
        
        System.out.println((double)pos/arr.length);
        System.out.println((double)neg/arr.length);
        System.out.println((double) zero/arr.length);

    }
}