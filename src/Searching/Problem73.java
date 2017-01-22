package Searching;

/**
 * Created by YSingh on 23/01/17.
 */


//Count number of trailing zeros in factorial of number
    //10! - 2
    //28! - 6

    //11! = 2^8 * 3^4 * 5^2 * 7 - counting equal pair of 5 and 2. But, 5s are always less so we can count them
    //Count number of 5s in prime factors = floor(n / 5) + floor(n / 25) + floor(n / 125) + ....

public class Problem73 {
    public static void main(String[] args) {
        System.out.println(trailingZeroInFactorial(5));
        System.out.println(trailingZeroInFactorial(10));
        System.out.println(trailingZeroInFactorial(28));
    }

    private static int trailingZeroInFactorial(int number) {
        int count = 0;
        for (int i = 5; number / i > 0 ; i = i * 5) {
            count = count + (number / i);
        }
        return count;
    }
}
