
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get(fileName))) {
            
            while (reader.hasNextLine()) {
                String line = reader.nextLine();

                if (line.equals("")) {
                    break;
                }

                String[] info = line.split(",");
                String name = info[0];
                int age = Integer.valueOf(info[1]);

                String yearSuffix = " years";

                if (age == 1) {
                    yearSuffix = " year";
                }

                System.out.println(name + ", age: " + age + yearSuffix);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}