
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int newInput = scanner.nextInt();

            if (newInput == 9999) {
                break;
            }

            numbers.add(newInput);
        }

        // find the smallest value in list

        int smallest = numbers.get(0);
        int idx = 0;

        while (idx < numbers.size()) {
            
            int currentNumber = numbers.get(idx);

            if (currentNumber < smallest) {
                smallest = currentNumber;
            }

            idx++;
        }

        // output the smallest number and its index location
        System.out.println("Smallest number: " + smallest);

        for (int i = 0; i < numbers.size(); i++) {
            
            if (smallest == numbers.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }

    }
}
