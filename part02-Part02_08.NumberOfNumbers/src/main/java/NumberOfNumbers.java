
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize count
        int numberCounter = 0;

        while (true) {
            System.out.println("Give a number:");
            int inputNumber = Integer.valueOf(scanner.nextLine());
            
            if (inputNumber == 0) {
                break;
            }
            numberCounter += 1;
        }
        System.out.println("Number of numbers: " + numberCounter);
    }
}
