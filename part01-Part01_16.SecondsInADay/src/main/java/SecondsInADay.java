
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Conversion factor: 24 h in a day, 60 min an hour, 60 s an hour
        System.out.println("How many days would you like to convert to seconds?");

        int days = Integer.valueOf(scanner.nextLine());

        int secondsInADay = days * 24 * 60 * 60;

        System.out.println(secondsInADay);
    }
}
