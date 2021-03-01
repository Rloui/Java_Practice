import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        double number = 0;
        double sum = 0;
        long avg = 0;
        int counter = 0;

        while (true) {
//            System.out.println("Enter a number:");

            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                counter++;
                number = scanner.nextInt();
                sum += number;
                avg = Math.round((double)(sum / counter));

            } else {
                System.out.println("SUM = " + (int) sum + " AVG = " + avg);
                break;
            }
            scanner.nextLine();
        }


        scanner.close();
    }
}
