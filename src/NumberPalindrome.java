public class NumberPalindrome {

    public static boolean isPalindrome (int number) {

        int reverse = 0;
        int digit;
        int count = 0;
        int initNumber = number;
        boolean isPalindrome = false;

        while (number != 0) {
            digit = number % 10;
            reverse = digit + (reverse * 10);
            number /= 10;
            count++;
        }

        if ( initNumber == reverse) {
            isPalindrome = true;
        }
        return isPalindrome;
    }
}
