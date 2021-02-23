public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        int numnum = number;
        int sum = 0;
        int lastDigit = 0;
        if(number > 0) {
            while (numnum > 0) {
                lastDigit = numnum % 10;
                if((lastDigit % 2) == 0) {
                    sum += lastDigit;
                }
                numnum /= 10;
            }
            return sum;
        }
        return -1;
    }
}
