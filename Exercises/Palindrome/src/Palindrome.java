public class Palindrome {
    public static boolean isPalindrome(int number) { // 707

        if(number < 0) {
            number *= -1;
        }

        int reverse = 0;
        int stored = number;

        while (stored > 0) {
            int lastDigit = stored % 10; // 7

            reverse = (reverse * 10) + lastDigit;

            stored /= 10;
        }

        if(reverse == number) {
            return true;
        } else {
            return false;
        }
    }
}
