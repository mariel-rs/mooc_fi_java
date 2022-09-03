import java.util.Scanner;

public class UserInterface {

    private TodoList tasks;
    private Scanner scan;

    public UserInterface(TodoList tasks, Scanner scan) {
        this.tasks = tasks;
        this.scan = scan;
    }

    public void start() {

        while (true) {
            System.out.println("Command: ");
            String command = this.scan.nextLine();

            if (command.equals("stop")) {
                break;
            }
            else if (command.equals("add")) {
                add();
            }
            else if (command.equals("list")) {
                list();
            }
            else if (command.equals("remove")) {
                remove();
            }
            else {
                System.out.println("Unknown command");
            }
        }
    }

    public void add() {

        System.out.println("To add: ");
        String task =  this.scan.nextLine();

        this.tasks.add(task);
    }

    public void list() {
        this.tasks.print();
    }

    public void remove() {
        System.out.println("Which one is removed? ");
        int idx = Integer.valueOf(this.scan.nextLine());

        this.tasks.remove(idx);
    }
}