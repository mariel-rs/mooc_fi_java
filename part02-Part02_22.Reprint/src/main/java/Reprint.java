
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        // ask the user for how many times should the text be printed
        // then call the printText-method multiple times with a while-loop
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many times?");

        int times = Integer.valueOf(scanner.nextLine());

        for (int i = 1; i <= times; i++) {
            printText();
        }
    }
    
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
