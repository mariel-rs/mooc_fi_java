import java.util.Scanner;

public class TextUI {

    private SimpleDictionary dict;
    private Scanner scan;

    public TextUI(Scanner scan, SimpleDictionary dict) {
        this.dict = dict;
        this.scan = scan;
    }

    public void start() {

        while (true) {
            System.out.println("Command: ");
            String command = this.scan.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            else if (command.equals("add")) {
               add();
            }
            else if (command.equals("search")) {
               search();
            }
            else {
                System.out.println("Unknown command");
            }
        }
    }
    
    public void add() {
        System.out.println("Word: ");
        String word = scan.nextLine();

        System.out.println("Translation: ");
        String translation = scan.nextLine();

        this.dict.add(word, translation);
    }

    public void search() {
        System.out.println("To be translated: ");
        String toTranslate = scan.nextLine();
        String translation = this.dict.translate(toTranslate);

        if (translation == null) {
            System.out.println("Word " + toTranslate + " was not found");
        }
        else {
            System.out.println("Translation: " + translation);
        }
    }
}