
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
    /* The program should read items from the user. When all the items from the 
    user have been read, the program prints the information of each item.

    For each item, its identifier and name should be read. If the identifier or 
    name is empty, the program stops asking for input, and prints all the item 
    information. */

        while (true) {
            
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();

            if (id.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            Item newItem = new Item(id, name);

            if (!items.contains(newItem)) {
                items.add(newItem);
            }
        }

        System.out.println("==Items==");
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
