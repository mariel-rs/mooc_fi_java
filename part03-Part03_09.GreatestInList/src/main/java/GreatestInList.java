
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        // implement finding the greatest number in the list here

        // initialize search
        int greatestNumber = list.get(0);
        int index = 0;

        while (index < list.size()) {
            
            int currNumber = list.get(index);

            if (currNumber > greatestNumber) {
                // update greatest number
                greatestNumber = currNumber;
            }
            
            index++;

        }

        System.out.println("The greatest number: " + greatestNumber);
    }
}
