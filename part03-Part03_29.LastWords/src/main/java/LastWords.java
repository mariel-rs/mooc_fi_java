
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            String input = scanner.nextLine();

            if (input.length() == 0) {
                break;
            }

            String[] words = input.split(" ");
            
            // print last element of array
            System.out.println(words[words.length -1]);
        }


    }
}
