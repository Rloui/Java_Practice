public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {

        int minNumber = 0;
        int largerNumber = 0;
        int greatestCD = 0;

        if(first >= 10 && second >= 10) {
            if(first < second) {
                minNumber = first;
                largerNumber = second;
            } else {
                minNumber = second;
                largerNumber = first;
            }

            for(int i = 1; i <= minNumber; i++) {
                if((minNumber % i) == 0) {
                    if((largerNumber % i) == 0){
                        greatestCD = i;
                    }
                }
            }
            return greatestCD;
        }
        return -1;
    }
}
