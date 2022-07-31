
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Implement a program, which calculates the sum 1+2+3+...+n where 
        n is given as user input. */


        System.out.println("Last number?");
        int lastNumber = Integer.valueOf(scanner.nextLine());

        int i = 1;
        int sum = 0;

        while (i <= lastNumber) {
            sum += i;

            i++;
        }
        System.out.println("The sum is " + sum);
    }
}
