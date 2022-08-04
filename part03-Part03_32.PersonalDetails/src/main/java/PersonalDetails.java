
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Write a program that reads names and birth years from the user until 
        an empty line is entered. The name and birth year are separated by a 
        comma.

        After that the program prints the longest name and the average of the 
        birth years. If multiple names are equally longest, you can print any of 
        them. You can assume that the user enters at least one person. */

        // Initialize search
        int counter = 0;
        int longestLength = 0;
        String longestName = "";
        int yearSum = 0;

        while (true) {
            
            String input = scanner.nextLine();

            if (input.length() == 0) {
                break;
            }

            String[] userInfo = input.split(",");
            String name = userInfo[0]; 

            if (name.length() > longestLength) {
                longestLength = name.length();
                longestName = name;
            }

            yearSum += Integer.valueOf(userInfo[1]);
            counter++;
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + 
        (1.0 * yearSum / counter));
    }
}
