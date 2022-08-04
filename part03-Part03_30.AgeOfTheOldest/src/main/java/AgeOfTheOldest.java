
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Write a program that reads names and ages from the user until an 
        empty line is entered. The name and age are separated by a comma.

        After reading all user input, the program prints the age of the oldest 
        person. You can assume that the user enters at least one person, and that 
        one of the users is older than the others. */

        // Initialize oldest age search
        int oldestAge = -10;

        while (true) {
            
            String input = scanner.nextLine();

            if (input.length() == 0) {
                break;
            }

            String[] userInfo = input.split(",");

            if (Integer.valueOf(userInfo[1]) > oldestAge) {
                oldestAge = Integer.valueOf(userInfo[1]);
            }
        }

        System.out.println("Age of the oldest: " + oldestAge);
    }
}
