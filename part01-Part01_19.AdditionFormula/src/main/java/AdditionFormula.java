
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Add two numbers and print the calc with details
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());

        System.out.println(firstNumber + " + " + secondNumber + " = " + 
        (firstNumber + secondNumber));
    }
}
