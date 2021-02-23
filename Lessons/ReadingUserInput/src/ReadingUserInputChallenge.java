import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    int counter = 0;
    int number = 0;
    int sum = 0;
    int numberOfNumbers = 0;
    Scanner scanner = new Scanner(System.in);

    while(true) {
        counter++;
        System.out.println("Enter number #" + counter);
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {
            number = scanner.nextInt();
            sum += number;
            numberOfNumbers++;
        } else {
            System.out.println("Invalid Number");
        }

        if(numberOfNumbers == 10){
            break;
        }
        scanner.nextLine();


        System.out.println("Sum: " + sum);
        scanner.close();
    }

}
