public class MinToYearsAndDays {
    public static void printYearsAndDays(long minutes){
        if( minutes >= 0){

            int years = (int) minutes / 60 / 24 / 365;
            int days = (int) (minutes - (years * 365 * 24 * 60)) / 60 / 24;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
