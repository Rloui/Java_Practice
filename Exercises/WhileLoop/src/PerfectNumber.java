public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {

        int positiveDivisors = 0;

        if(number > 1) {
            for(int i = 1; i < number; i++) {
                if((number % i) == 0) {
                    positiveDivisors += i;
                }
            }
            if(number == positiveDivisors) {
                return true;
            }
        }
        return false;
    }
}
