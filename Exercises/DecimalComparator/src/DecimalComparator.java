public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double param1, double param2){
        if((int)(param1 * 1000) == (int)(param2 * 1000)) {
            return true;
        }
        return false;
    }
}
