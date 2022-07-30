
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Write a program that reads values from the user until they input a 0. 
        After this, the program prints the total number of inputted values that 
        are negative. The zero that's used to exit the loop should not be 
        included in the total number count. */

        int counter = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.next());

            if (number == 0) {
                break;
            }
            
            if (number < 0) {
                counter += 1;
            }
        }
        System.out.println("Number of negative numbers: " + counter);
    }
}
