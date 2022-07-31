
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Implement a program which calculates the factorial of a number 
        given by the user. */

        System.out.println("Give a number:");

        int number = Integer.valueOf(scanner.nextLine());

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial: " + factorial);
    }
}
