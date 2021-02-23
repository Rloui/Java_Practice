public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year){
        if(year >= 1 && year < 9999) {
            if(year % 4 == 0){
                if(year % 100 == 0){
                    if(year % 400 == 0){
                        return true;
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static int getdaysInMonth(int month, int year){

        if ((month > 1 || month < 12) && (year > 1 || year < 9999)) {
            if (isLeapYear(year) && month == 2){
                return 29;
            }

            switch (month){
                case 11: case 4: case 6: case 9:
                    return 30;

                case 2:
                    return 28;

                default:
                    return 31;

            }


        }
        return -1;
    }
}
