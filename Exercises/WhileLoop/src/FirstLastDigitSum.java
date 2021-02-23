public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int firstDigit = number;
        int lastDigit = number % 10;
        if(number >= 0) {
            while(firstDigit >= 10) {
                System.out.println("first digit breaking down: " + firstDigit);
                firstDigit = (firstDigit / 10);
            }
            return firstDigit + lastDigit;
        }
        return -1;
    }
}
