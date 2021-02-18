public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean isBarking = false;

        if(hourOfDay < 0 || hourOfDay > 23){
            isBarking = false;
        } else if((barking && hourOfDay < 8) || (barking && hourOfDay > 22)) {
            isBarking = true;
        }
        return isBarking;
    }
}
