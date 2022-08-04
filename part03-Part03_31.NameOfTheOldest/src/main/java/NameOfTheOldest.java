
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize oldest age search
        int oldestAge = -10;
        String oldestName = "";

        while (true) {
            
            String input = scanner.nextLine();

            if (input.length() == 0) {
                break;
            }

            String[] userInfo = input.split(",");
            int age = Integer.valueOf(userInfo[1]);

            if (age > oldestAge) {
                oldestAge = age;
                oldestName = userInfo[0];
            }
        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
