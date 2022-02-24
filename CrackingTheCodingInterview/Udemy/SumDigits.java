package CrackingTheCodingInterview.Udemy;

public class SumDigits {
    
    public int sumDigits(int n) {
        //n is the number we want to sum
        //75 => 7 + 5 => 12
        //123 => 1 + 2 + 3 => 6
        //123
             
        int sum = 0;
        while (n > 0) {
            //currently, sum=5
            //sum = sum + 7 % 10
            //sum = 5 + 7
            //sum = 12
            
            sum += n % 10;
            //n = 7/10; => 0
            n = n / 10;
        }
        return sum;
    }
}