import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            
            System.out.print("Title: ");
            String title = scan.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scan.nextLine());

            System.out.print("Publication year: ");
            int publishYear = Integer.valueOf(scan.nextLine());

            bookList.add(new Book(title, pages, publishYear));

        }

        System.out.println("What information will be printed?");
        String printInfo = scan.next();

        for (Book book : bookList) {
            if (printInfo.equals("everything")) {
                System.out.println(book);
            }
            else if (printInfo.equals("name")) {
                System.out.println(book.getBookTitle());
            }
        }
    }
}
