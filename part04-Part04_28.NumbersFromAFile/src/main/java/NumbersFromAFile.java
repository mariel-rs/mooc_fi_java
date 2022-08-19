
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        // Reader section
        ArrayList<Integer> numberList = new ArrayList<>();

        try (Scanner reader = new Scanner(Paths.get(file))) {
            
            while (reader.hasNextLine()) {
                
                int nextNumber = Integer.valueOf(reader.nextLine());
                numberList.add(nextNumber);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Find the numbers in the given interval
        int counter = 0;

        for (Integer number : numberList) {
            if (number >= lowerBound && number <= upperBound) {
                counter++;
            }    
        }

        System.out.println("Numbers: " + counter);
    }

}